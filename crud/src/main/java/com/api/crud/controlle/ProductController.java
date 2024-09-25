package com.api.crud.controlle;

import com.api.crud.Repositories.ProductRepositories;
import com.api.crud.mode.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping ("/product")

public class ProductController {

    @Autowired
    ProductRepositories repositories;


    @GetMapping
   public ResponseEntity getAll () {
        List <Product> listProduct = repositories.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProduct);
    }
}
