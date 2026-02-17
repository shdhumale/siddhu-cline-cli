package com.example.restapiconsumer.service;

import com.example.restapiconsumer.model.Product;
import com.example.restapiconsumer.model.ProductRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    
    @Value("${external.api.base-url}")
    private String baseUrl;
    
    private final RestTemplate restTemplate;
    
    public ProductService() {
        this.restTemplate = new RestTemplate();
    }
    
    /**
     * GET /objects - Retrieve all objects
     */
    public List<Product> getAllProducts() {
        String url = baseUrl + "/objects";
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        ResponseEntity<Product[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                Product[].class
        );
        
        return Arrays.asList(response.getBody());
    }
    
    /**
     * GET /objects/{id} - Retrieve a specific object by ID
     */
    public Product getProductById(String id) {
        String url = baseUrl + "/objects/" + id;
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        ResponseEntity<Product> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                Product.class
        );
        
        return response.getBody();
    }
    
    /**
     * POST /objects - Create a new object
     */
    public Product createProduct(ProductRequest request) {
        String url = baseUrl + "/objects";
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<ProductRequest> entity = new HttpEntity<>(request, headers);
        
        ResponseEntity<Product> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                entity,
                Product.class
        );
        
        return response.getBody();
    }
    
    /**
     * PUT /objects/{id} - Update an existing object (full update)
     */
    public Product updateProduct(String id, ProductRequest request) {
        String url = baseUrl + "/objects/" + id;
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<ProductRequest> entity = new HttpEntity<>(request, headers);
        
        ResponseEntity<Product> response = restTemplate.exchange(
                url,
                HttpMethod.PUT,
                entity,
                Product.class
        );
        
        return response.getBody();
    }
    
    /**
     * PATCH /objects/{id} - Partially update an object
     */
    public Product patchProduct(String id, ProductRequest request) {
        String url = baseUrl + "/objects/" + id;
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<ProductRequest> entity = new HttpEntity<>(request, headers);
        
        ResponseEntity<Product> response = restTemplate.exchange(
                url,
                HttpMethod.PATCH,
                entity,
                Product.class
        );
        
        return response.getBody();
    }
    
    /**
     * DELETE /objects/{id} - Delete an object
     */
    public void deleteProduct(String id) {
        String url = baseUrl + "/objects/" + id;
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        restTemplate.exchange(
                url,
                HttpMethod.DELETE,
                entity,
                Void.class
        );
    }
}
