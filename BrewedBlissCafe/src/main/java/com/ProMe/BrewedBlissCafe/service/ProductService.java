package com.ProMe.BrewedBlissCafe.service;

import com.ProMe.BrewedBlissCafe.Model.Product;
import com.ProMe.BrewedBlissCafe.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct(){
        return repo.findAll();
    }

}
