package com.example.restapiconsumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("data")
    private ProductData data;
    
    @JsonProperty("createdAt")
    private String createdAt;
    
    // Default constructor
    public Product() {
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
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
    
    public String getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
