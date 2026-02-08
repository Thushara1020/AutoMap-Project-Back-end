package com.AutoMap.AutoMap_Project_Back_end.controller;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarBrands;
import com.AutoMap.AutoMap_Project_Back_end.service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin
public class CarBrandController {

    @Autowired
    private CarBrandService carBrandService;

    @GetMapping("/all")
    public List<CarBrands> getAllCarBrands() {
        return carBrandService.getAllCarBrands();
    }

    @PostMapping("/add")
    public ResponseEntity<CarBrands> addCarBrand(@RequestBody CarBrands carBrands) {
        CarBrands savedBrand = carBrandService.saveCarBrand(carBrands);
        return ResponseEntity.ok(savedBrand);
    }
}