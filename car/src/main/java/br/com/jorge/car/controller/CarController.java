package br.com.jorge.car.controller;

import br.com.jorge.car.dto.CarDtoRequest;
import br.com.jorge.car.dto.CarDtoResponse;
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
    public String post(@RequestBody CarDtoRequest carDtoRequest){
        carService.save(carDtoRequest);
        return "Car successfully added!";
    }

    @GetMapping("/get/{idChassi}")
    public CarDtoResponse get(@PathVariable Long idChassi){
        return carService.getByIdChassi(idChassi);
    }

}
