package com.programming.techie.productservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.techie.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String>
{

}
