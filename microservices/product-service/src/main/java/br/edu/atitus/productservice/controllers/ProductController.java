package br.edu.atitus.productservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> getProduct(){
        String retorno = String.format("%s %s!!!!", "Hello", "World");
        return ResponseEntity.ok(retorno);
    }
}
