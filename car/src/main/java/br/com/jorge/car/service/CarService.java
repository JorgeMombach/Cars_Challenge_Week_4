package br.com.jorge.car.service;

import br.com.jorge.car.dto.CarDtoRequest;
import br.com.jorge.car.dto.CarDtoResponse;
import br.com.jorge.car.entity.Car;
import br.com.jorge.car.exception.CarNotFoundException;
import br.com.jorge.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public void save(CarDtoRequest carDtoRequest) {

        if(carDtoRequest.getBrand().equalsIgnoreCase("Ford")){
            Car car = new Car(
                    null,
                    carDtoRequest.getName(),
                    carDtoRequest.getBrand(),
                    carDtoRequest.getColor(),
                    carDtoRequest.getFabricationYear());

            carRepository.save(car);
        } else if (carDtoRequest.getBrand().equalsIgnoreCase("Chevrolet")) {
            Car car = new Car(
                    null,
                    carDtoRequest.getName(),
                    carDtoRequest.getBrand(),
                    carDtoRequest.getColor(),
                    carDtoRequest.getFabricationYear());

            carRepository.save(car);
        } else if (carDtoRequest.getBrand().equalsIgnoreCase("BMW")) {
            Car car = new Car(
                    null,
                    carDtoRequest.getName(),
                    carDtoRequest.getBrand(),
                    carDtoRequest.getColor(),
                    carDtoRequest.getFabricationYear());

            carRepository.save(car);
        } else if (carDtoRequest.getBrand().equalsIgnoreCase("Volvo")) {
            Car car = new Car(
                    null,
                    carDtoRequest.getName(),
                    carDtoRequest.getBrand(),
                    carDtoRequest.getColor(),
                    carDtoRequest.getFabricationYear());

            carRepository.save(car);
        } else{
        }


    }


    //Improve this!!
    public CarDtoResponse getByIdChassi(Long idChassi) {
        Car car = carRepository.findById(idChassi).orElseThrow(() -> new CarNotFoundException("Car not found"));
        CarDtoResponse carDtoResponse = new CarDtoResponse(
                car.getIdChassi(),
                car.getName(),
                car.getBrand(),
                car.getColor(),
                car.getFabricationYear()
                );
        return carDtoResponse;
    }
}

