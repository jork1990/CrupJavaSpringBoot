package com.JorgeCode.CrupJavaSpringBoot.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    HashMap<String, Object> datos ;

    private final ProductRepository productRepository;
    @Autowired
    public  ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @GetMapping
    public List<Product> getProducts (){
        return this.productRepository.findAll();

    };

    public ResponseEntity<Object> newProduct(Product product) {
        Optional<Product> res = productRepository.findProductByDocumento(product.getDocumento());
        datos= new HashMap<>();

        if(res.isPresent() && product.getId()== null){
            datos.put("error",true);
            datos.put("message","ya exixte el Documento Registrado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );
        }
        datos.put("message","Se Guardo Con Exito");
        if(product.getId()!= null){
            datos.put("message","Se actualizo Con Exito");
        }

        productRepository.save(product);
        datos.put("data",product);

        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }
    public ResponseEntity<Object>  deletepruduct(Long id){
        datos= new HashMap<>();
        boolean existe = this.productRepository.existsById(id);
        if (!existe){
            datos.put("error",true);
            datos.put("message","No exixte un Documento Con El id Registrado");
            return new ResponseEntity<>(
                    datos,
                    HttpStatus.CONFLICT
            );

        }

        productRepository.deleteById(id);


        datos.put("message","Producto Eliminado");
        return new ResponseEntity<>(
                datos,
                HttpStatus.ACCEPTED
        );
    }

}

