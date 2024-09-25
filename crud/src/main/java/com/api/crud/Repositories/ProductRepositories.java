package com.api.crud.Repositories;

import com.api.crud.mode.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepositories extends JpaRepository<Product, Integer> {


}
