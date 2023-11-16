package web;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private Integer price;

    public Car(String model, String color, Integer price){
        this.color=color;
        this.model=model;
        this.price=price;
    }
    //Хотелось проверить одну штуку
    public List<String> getParams(){
        List<String> params=new ArrayList<>();
        params.add(model);
        params.add(color);
        params.add(price.toString());
        return params;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    //вообще геттеры и сеттеры тут даже не надо, но пусть будет, технически они всегда нужны

}
