package com.JorgeCode.CrupJavaSpringBoot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
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
    
    
   @PostMapping
    public ResponseEntity registrarProducto(@RequestBody Product product){
      return   this.productService.newProduct(product);
        
}
    @PutMapping
    public ResponseEntity<Object> actualizarProducto(@RequestBody Product product){

        return   this.productService.newProduct(product);

    }
    @DeleteMapping(path = "{productId}")
    public  ResponseEntity<Object> eliminar(@PathVariable("productId")Long id){
        return  this.productService.deletepruduct(id);

    }
}
