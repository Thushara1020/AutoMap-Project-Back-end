package com.AutoMap.AutoMap_Project_Back_end.repository;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCountryRepository extends JpaRepository<CarCountry, Long> {
}