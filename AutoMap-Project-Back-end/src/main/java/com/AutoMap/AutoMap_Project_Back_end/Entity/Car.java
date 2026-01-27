package com.AutoMap.AutoMap_Project_Back_end.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String Country_of_Origin;
    private String description;
    private String year;
    private String price;
    private String engineType;      // e.g., Petrol, Diesel, Hybrid, Electric
    private String transmission;    // e.g., Automatic, Manual, CVT
    private String engineCapacity;  // e.g., 1500cc
    private String engineModel;
    private String topSpeed;        // e.g., 200 km/h
    private String fuelConsumption; // e.g., 15 km/L
    private String dimensions;      // e.g., 4625 x 1815 x 1430 mm
    private String curbWeight;      // Weight (Curb)
    private String groundClearance;
    private String bootSpace;
    private String turningRadius;
    private int seatingCapacity;
    private int airbagCount;
    private String tireSize;
    private String mainGrades;
    private String image;

}