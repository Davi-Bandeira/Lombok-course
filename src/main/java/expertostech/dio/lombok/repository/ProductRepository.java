package expertostech.dio.lombok.repository;

import expertostech.dio.lombok.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
