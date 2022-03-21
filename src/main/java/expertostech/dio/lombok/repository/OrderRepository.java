package expertostech.dio.lombok.repository;

import expertostech.dio.lombok.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Integer> {
}
