package com.AutoMap.AutoMap_Project_Back_end.controller;

import com.AutoMap.AutoMap_Project_Back_end.Entity.Car;
import com.AutoMap.AutoMap_Project_Back_end.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(carService.saveCar(car));
    }

    @GetMapping("/all")
    public List<Car> getAll() {
        return carService.getAllCars();
    }

    @GetMapping("/search")
    public List<Car> getByBrand(@RequestParam String brand) {
        return carService.getCarsByBrand(brand);
    }
}