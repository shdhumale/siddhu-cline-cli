package com.example.restapiconsumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductRequest {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("data")
    private ProductData data;
    
    // Default constructor
    public ProductRequest() {
    }
    
    // Constructor with fields
    public ProductRequest(String name, ProductData data) {
        this.name = name;
        this.data = data;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ProductData getData() {
        return data;
    }
    
    public void setData(ProductData data) {
        this.data = data;
    }
}
