package dev.gabriel.stockflow.controller;

import dev.gabriel.stockflow.model.Product;
import dev.gabriel.stockflow.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Product> criar(@RequestBody Product product) {
        return ResponseEntity.ok(service.salvar(product));
    }
}