package com.AutoMap.AutoMap_Project_Back_end.controller;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarCountry;
import com.AutoMap.AutoMap_Project_Back_end.service.CarCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CarCountryController {

    @Autowired
    private CarCountryService carCountryService;

    @PostMapping("/add")
    public ResponseEntity<CarCountry> addCountry(@RequestBody CarCountry carCountry) {
        return ResponseEntity.ok(carCountryService.saveCarCountry(carCountry));
    }

    @GetMapping("/all")
    public List<CarCountry> getAll() {
        return carCountryService.getAllCarCountries();
    }
}