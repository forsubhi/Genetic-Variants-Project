package com.database.project.repository;

import com.database.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String>{

    List<Product> findByDetailsContains(String filter);
}