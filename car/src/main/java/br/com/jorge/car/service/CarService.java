package br.com.jorge.car.service;

import br.com.jorge.car.dto.CarDtoRequest;
import br.com.jorge.car.dto.CarDtoResponse;
import br.com.jorge.car.entity.Car;
import br.com.jorge.car.exception.CarNotFoundException;
import br.com.jorge.car.exception.InvalidBrandException;
import br.com.jorge.car.exception.MissingFieldsException;
import br.com.jorge.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public String save(CarDtoRequest carDtoRequest) throws InvalidBrandException, MissingFieldsException {

        String carBrand = carDtoRequest.getBrand().toLowerCase();
        String carName = carDtoRequest.getName();
        String carColor = carDtoRequest.getColor();
        String carFabricationYear = carDtoRequest.getFabricationYear();

        if (carBrand.equalsIgnoreCase("ford")
                || carBrand.equalsIgnoreCase("chevrolet")
                || carBrand.equalsIgnoreCase("bmw")
                || carBrand.equalsIgnoreCase("volvo")) {

            if (isNotBlank(carName) && isNotBlank(carColor) && isNotBlank(carFabricationYear)){
                Car car = new Car(
                        null,
                        carDtoRequest.getName(),
                        carDtoRequest.getBrand(),
                        carDtoRequest.getColor(),
                        carDtoRequest.getFabricationYear());

                carRepository.save(car);
                return "Car successfully added!";
            } else{
                throw new MissingFieldsException("All fields are required in order to add a car. Please insert data again.");
            }
        } else {
            throw new InvalidBrandException("Invalid brand! Only Ford, Chevrolet, BMW and Volvo are allowed.");
        }
    }

    private boolean isNotBlank(String value){
        return value != null && !value.trim().isEmpty();
    }

    //Improve this!!
    public CarDtoResponse getByIdChassi(Long idChassi) {
        Car car = carRepository.findById(idChassi).orElseThrow(() -> new CarNotFoundException("Car not found. Please try a valid iD."));
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

