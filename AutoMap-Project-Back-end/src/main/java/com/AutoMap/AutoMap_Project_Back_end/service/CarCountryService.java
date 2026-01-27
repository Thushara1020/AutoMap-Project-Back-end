package com.AutoMap.AutoMap_Project_Back_end.service;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarCountry;
import com.AutoMap.AutoMap_Project_Back_end.repository.CarCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCountryService {

    @Autowired
    private CarCountryRepository carCountryRepository;

    public CarCountry saveCarCountry(CarCountry carCountry) {
        return carCountryRepository.save(carCountry);
    }

    public List<CarCountry> getAllCarCountries() {
        return carCountryRepository.findAll();
    }
}