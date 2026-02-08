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
    private String engineType;
    private String transmission;
    private String engineCapacity;
    private String engineModel;
    private String topSpeed;
    private String fuelConsumption;
    private String dimensions;
    private String curbWeight;
    private String groundClearance;
    private String bootSpace;
    private String turningRadius;
    private int seatingCapacity;
    private int airbagCount;
    private String tireSize;
    private String mainGrades;
    private String imgurl;

}