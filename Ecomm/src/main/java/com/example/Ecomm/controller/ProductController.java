package com.example.Ecomm.controller;

import com.example.Ecomm.model.Product;
import com.example.Ecomm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ap1/v1/ecomm-app-product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/create-product")
    public void addProduct(@RequestBody Product product)
    {
        productService.addProduct(product);
    }

    @GetMapping("find-all")
    public List<Product> findAllProducts()
    {
        return productService.findAll();
    }

    @DeleteMapping("/delete-product/id/{id}")
    public void deleteProduct(@PathVariable int id_p)
    {
        productService.deleteProduct(id_p);
    }
}
