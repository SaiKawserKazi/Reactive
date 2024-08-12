package com.konasl.billing.service;

import com.konasl.billing.entity.Product;
import com.konasl.billing.enums.DomainStatus;
import com.konasl.billing.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product> createProduct(Product product) {
        product.setDomainStatus(DomainStatus.ACTIVE.getValue());
        return productRepository.save(product);
    }

    public Mono<Product> updateProduct(Long id, Product product) {
        return productRepository.findById(id)
                .flatMap(existingProduct -> {
                    existingProduct.setTitle(product.getTitle());
                    existingProduct.setDescription(product.getDescription());
                    existingProduct.setDomainStatus(product.getDomainStatus());
                    return productRepository.save(existingProduct);
                });
    }

    public Mono<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Flux<Product> getAllProducts() {
        return productRepository.findAll()
                .filter(product -> product.getDomainStatus() != DomainStatus.DELETED.getValue());
    }

    public Mono<Void> softDeleteProduct(Long id) {
        return productRepository.findById(id)
                .flatMap(product -> {
                    product.setDomainStatus(DomainStatus.DELETED.getValue());
                    return productRepository.save(product);
                }).then();
    }
}
