package com.JorgeCode.CrupJavaSpringBoot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
@RequestMapping (path = "api/v1/products")
public class ProductContoller {
    private final ProductService productService;
    @Autowired
    public ProductContoller(ProductService productService){

        this.productService =productService;
    }
    @GetMapping
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

}
