package br.com.jorge.car.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @GetMapping("/get")
    public String get(){
        return carService.getString();
    }

    @PostMapping("/post")

}
