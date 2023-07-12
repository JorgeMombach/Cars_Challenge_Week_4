package br.com.jorge.car.controller;

import br.com.jorge.car.entity.Car;
import br.com.jorge.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/get")
    public String get(){
        return carService.getString();
    }

    @PostMapping("/post")
    public String post(@RequestBody Car car){
        return car.toString();
    }

}
