package com.ProMe.BrewedBlissCafe.Repo;

import com.ProMe.BrewedBlissCafe.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {



}
