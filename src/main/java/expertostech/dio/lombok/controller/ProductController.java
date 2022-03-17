package expertostech.dio.lombok.controller;

import expertostech.dio.lombok.model.ProductModel;
import expertostech.dio.lombok.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ProductModel>> listAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel productModel) {
        return ResponseEntity.ok(productRepository.save(productModel));
    }
}
