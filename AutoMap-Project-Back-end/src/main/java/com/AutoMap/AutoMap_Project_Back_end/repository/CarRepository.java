package com.AutoMap.AutoMap_Project_Back_end.repository;

import com.AutoMap.AutoMap_Project_Back_end.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);
}