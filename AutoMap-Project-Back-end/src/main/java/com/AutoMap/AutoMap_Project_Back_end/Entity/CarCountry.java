package com.AutoMap.AutoMap_Project_Back_end.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CarCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CarCountryId;

    private String countryName;
    private String brand;
    private String image;
}
