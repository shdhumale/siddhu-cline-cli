package com.example.restapiconsumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class ProductData {
    
    @JsonProperty("year")
    private Integer year;
    
    @JsonProperty("price")
    private Double price;
    
    @JsonProperty("CPU model")
    private String cpuModel;
    
    @JsonProperty("Hard disk size")
    private String hardDiskSize;
    
    @JsonProperty("color")
    private String color;
    
    // Default constructor
    public ProductData() {
    }
    
    // Getters and Setters
    public Integer getYear() {
        return year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getCpuModel() {
        return cpuModel;
    }
    
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }
    
    public String getHardDiskSize() {
        return hardDiskSize;
    }
    
    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
