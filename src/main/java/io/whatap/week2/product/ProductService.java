package io.whatap.week2.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findById(@PathVariable("id") long id) {
        Optional<Product> ret = productRepository.findById(id);
        return ret.get();
    }

    public Product save(String name) {
        Product product = new Product(name);
        return productRepository.save(product);
    }
}
