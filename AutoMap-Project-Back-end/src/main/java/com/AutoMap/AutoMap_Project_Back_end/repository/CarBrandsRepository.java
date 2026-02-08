package com.AutoMap.AutoMap_Project_Back_end.repository;

import com.AutoMap.AutoMap_Project_Back_end.Entity.CarBrands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBrandsRepository extends JpaRepository<CarBrands, Long> {
}