package com.ProductService.ProductService.Repository;

import com.ProductService.ProductService.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
