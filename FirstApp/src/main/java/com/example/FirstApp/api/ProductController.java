package com.example.FirstApp.api;

import com.example.FirstApp.api.dto.ProductDtoAdauga;
import com.example.FirstApp.domain.product.Product;
import com.example.FirstApp.domain.product.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @GetMapping("/products/{id}")
    Product getById(@PathVariable Integer id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("/adauga")
    Product adauga(@RequestBody ProductDtoAdauga commandDto) {
        Product productToBeSaved = new Product();
        productToBeSaved.setName(commandDto.getName());
        return productRepository.save(productToBeSaved);
    }

}