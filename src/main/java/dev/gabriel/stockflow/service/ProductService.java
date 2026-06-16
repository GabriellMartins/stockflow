package dev.gabriel.stockflow.service;

import dev.gabriel.stockflow.model.Product;
import dev.gabriel.stockflow.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> listarTodos() {
        return repository.findAll();
    }

    public Product salvar(Product product) {
        return repository.save(product);
    }
}