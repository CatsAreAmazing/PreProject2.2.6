package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carList(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        //по заданию не очень понятно, где именно создавать машины, но вроде тут вариантов кроме этого
        //и нет
        cars.add(new Car("Модель раз", "Красный", 500000));
        cars.add(new Car("Модель два", "Синий", 511111));
        cars.add(new Car("Модель три", "Зеленый", 5002310));
        cars.add(new Car("Модель четыре", "Желтый", 50312452));
        cars.add(new Car("Модель пять", "⛧Странный⛧", 666666));
        //cars.add(new Car("Модель шесть", "Красный", 500000));
        //При запросе /cars выводить весь список
        //При count ≥ 5 выводить весь список машин - конкретно про 5 машин ничего не сказано, так что...
        if (Objects.isNull(count) || count>=5){
            count=cars.size();
            //count=5;
        }
        model.addAttribute("cars", cars.subList(0, count));
        return "cars";
    }

}