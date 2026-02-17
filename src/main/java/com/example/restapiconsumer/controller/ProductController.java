package com.example.restapiconsumer.controller;

import com.example.restapiconsumer.model.Product;
import com.example.restapiconsumer.model.ProductRequest;
import com.example.restapiconsumer.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    
    private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    /**
     * GET /api/products - Retrieve all objects
     * Corresponding to: GET https://api.restful-api.dev/objects
     */
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
    
    /**
     * GET /api/products/{id} - Retrieve a specific object by ID
     * Corresponding to: GET https://api.restful-api.dev/objects/7
     */
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }
    
    /**
     * POST /api/products - Create a new object
     * Corresponding to: POST https://api.restful-api.dev/objects
     */
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request) {
        Product product = productService.createProduct(request);
        return ResponseEntity.ok(product);
    }
    
    /**
     * PUT /api/products/{id} - Update an existing object (full update)
     * Corresponding to: PUT https://api.restful-api.dev/objects/7
     */
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody ProductRequest request) {
        Product product = productService.updateProduct(id, request);
        return ResponseEntity.ok(product);
    }
    
    /**
     * PATCH /api/products/{id} - Partially update an object
     * Corresponding to: PATCH https://api.restful-api.dev/objects/7
     */
    @PatchMapping("/{id}")
    public ResponseEntity<Product> patchProduct(@PathVariable String id, @RequestBody ProductRequest request) {
        Product product = productService.patchProduct(id, request);
        return ResponseEntity.ok(product);
    }
    
    /**
     * DELETE /api/products/{id} - Delete an object
     * Corresponding to: DELETE https://api.restful-api.dev/objects/6
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
