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

    @PostMapping("/post")
    public Car post(@RequestBody Car car){
        return carService.save(car);
    }

    @GetMapping("/get/{idChassi}")
    public Car post(@PathVariable Long idChassi){
        return carService.getByIdChassi(idChassi);
    }

}
