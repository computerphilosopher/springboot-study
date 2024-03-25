package io.whatap.week2.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable("id") long id) {
        return productService.findById(id);
    }

    @PostMapping("/products")
    public Product save(@RequestBody String name) {
        return productService.save(name);
    }
}
