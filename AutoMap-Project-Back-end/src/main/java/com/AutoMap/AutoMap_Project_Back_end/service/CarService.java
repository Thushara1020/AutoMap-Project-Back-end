package com.AutoMap.AutoMap_Project_Back_end.service;

import com.AutoMap.AutoMap_Project_Back_end.Entity.Car;
import com.AutoMap.AutoMap_Project_Back_end.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public List<Car> getCarsByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }
}