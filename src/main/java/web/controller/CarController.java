package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import model.Car;
import service.CarService;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String carList(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carService.carList(count));
        return "cars";
    }
}