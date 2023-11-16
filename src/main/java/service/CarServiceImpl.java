package service;

import model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CarServiceImpl implements CarService{
    private static List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Модель раз", "Красный", 500000),
            new Car("Модель два", "Синий", 511111),
            new Car("Модель три", "Зеленый", 5002310),
            new Car("Модель четыре", "Желтый", 50312452),
            new Car("Модель пять", "⛧Странный⛧", 666666)
            ));
    @Override
    public List<Car> carList(Integer count) {
        if (Objects.isNull(count) || count>=5){
            count=cars.size();
        }
        return cars.subList(0, count);
    }
}
