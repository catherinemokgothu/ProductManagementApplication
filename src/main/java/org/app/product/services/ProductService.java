package org.app.product.services;


import org.app.product.models.Product;
import org.app.product.repositories.ProductRepositories;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepositories productRepositories;

    public ProductService(ProductRepositories productRepositories) {
        this.productRepositories = productRepositories;
    }


    public Product createProductData(Product product) {
        productRepositories.save(product);
        return product;
    }

    public List<Product> getProducts() {
        return productRepositories.findAll();
    }

    public Optional<Product> getProduct(long id) {
        return productRepositories.findById(id);
    }

    public Product deleteProductById(Product product) {
        productRepositories.deleteById(product.getId());
        return product;
    }
}
