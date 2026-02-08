package com.AutoMap.AutoMap_Project_Back_end.service;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarBrands;
import com.AutoMap.AutoMap_Project_Back_end.repository.CarBrandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandService {

    @Autowired
    private CarBrandsRepository carBrandsRepository;

    public CarBrands saveCarBrand(CarBrands carBrands) {
        return carBrandsRepository.save(carBrands);
    }

    public List<CarBrands> getAllCarBrands() {
        return carBrandsRepository.findAll();
    }
}