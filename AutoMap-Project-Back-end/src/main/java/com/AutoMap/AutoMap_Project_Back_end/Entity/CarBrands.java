package com.AutoMap.AutoMap_Project_Back_end.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarBrands {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carBrandId;

    private String brandName;
    private String image;
    private String country;

    public Long getCarBrandId() { return carBrandId; }
    public void setCarBrandId(Long carBrandId) { this.carBrandId = carBrandId; }
    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}