package br.com.jorge.car.service;

import br.com.jorge.car.entity.Car;
import br.com.jorge.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public String getString() {
        return "Dentro do Service";
    }

    public Car save(Car car) {
        carRepository.save(car);
        return car;
    }

    public Car getByIdChassi(Long idChassi) {
        return carRepository.findById(idChassi).orElseThrow();
    }
}

