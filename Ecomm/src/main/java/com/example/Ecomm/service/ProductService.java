package com.example.Ecomm.service;

import com.example.Ecomm.model.Product;
import com.example.Ecomm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService{

    private static List<Product> products = new ArrayList<>();

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    @Override
    public List<Product> findAll()
    {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(int id_p)
    {
        productRepository.deleteById(id_p);
    }
    
}
