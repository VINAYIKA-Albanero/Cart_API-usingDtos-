package com.example.demo.Controller;



        import com.example.demo.Dtos.ProductDto;
        import com.example.demo.Services.ProductService;
        import com.example.demo.model.Product;
//        import com.example.demo.service.ProductService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{name}")
    public Product getProduct(@PathVariable String name) {
        return productService.getProduct(name);
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDto productDto) {
        return productService.createProduct(productDto);
    }

//    @PutMapping("/{id}")
//    public Product updateProduct(@PathVariable String id, @RequestBody Product product) {
//        return productService.updateProduct(id, product);
//    }

   //
}
