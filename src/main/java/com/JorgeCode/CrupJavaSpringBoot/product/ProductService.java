package com.JorgeCode.CrupJavaSpringBoot.product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class ProductService {
    @GetMapping
    public List<Product> getProducts (){
        return List.of(
                new Product(
                        8635865L,
                        8635865,
                        "Jorge Luis",
                        "Camachos Castro",
                        "Jorge-364@gmail.com",
                        312986856,
                        LocalDate.of(2024, Month.AUGUST,7),
                        4
                )
        );

    };
}
