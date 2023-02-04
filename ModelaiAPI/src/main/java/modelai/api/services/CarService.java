package modelai.api.services;

import modelai.api.entities.Car;
import modelai.api.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository repository;

    public void insertData(Car car) {
        repository.save(car);
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }
}
