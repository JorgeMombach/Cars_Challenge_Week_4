package br.com.jorge.car.controller;

import br.com.jorge.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/get")
    public String get(){
        return carService.getString();
    }



}
