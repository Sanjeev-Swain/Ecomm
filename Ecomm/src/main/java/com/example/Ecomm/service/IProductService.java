package com.example.Ecomm.service;

import com.example.Ecomm.model.Product;

import java.util.List;

public interface IProductService {

    public void addProduct(Product product);

    public List<Product> findAll();

    public void deleteProduct(int id_p);
}
