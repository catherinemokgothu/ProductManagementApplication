package org.app.product.controllers;

import org.app.product.models.Product;
import org.app.product.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProduct() {
       return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductId(@PathVariable("id") long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProductData(product);
    }
}
