package modelai.api.controllers;

import modelai.api.entities.Car;
import modelai.api.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cars")
public class CarController {

    @Autowired
    CarService service;
    @PostMapping(value = "add")
    public String addCar(@RequestBody Car car){
        service.insertData(car);
        return "Carro adicionado!";
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getAllCars();
    }
}
