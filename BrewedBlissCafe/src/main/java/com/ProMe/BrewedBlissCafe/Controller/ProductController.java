package com.ProMe.BrewedBlissCafe.Controller;


import com.ProMe.BrewedBlissCafe.Model.Product;
import com.ProMe.BrewedBlissCafe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return  "Hello Welcome To CAFE";
    }

    @RequestMapping("/products")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

}
