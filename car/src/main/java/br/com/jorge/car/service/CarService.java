package br.com.jorge.car.service;

import br.com.jorge.car.dto.CarDtoRequest;
import br.com.jorge.car.entity.Car;
import br.com.jorge.car.exception.CarNotFoundException;
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

    public Car save(CarDtoRequest carDtoRequest) {

        Car car = new Car(
                null,
                carDtoRequest.getName(),
                carDtoRequest.getBrand(),
                carDtoRequest.getColor(),
                carDtoRequest.getFabricationYear());

        carRepository.save(car);
        return car;
    }

    //Improve this!!
    public Car getByIdChassi(Long idChassi) {
        return carRepository.findById(idChassi).orElseThrow(() -> new CarNotFoundException("Car not found"));
    }
}

