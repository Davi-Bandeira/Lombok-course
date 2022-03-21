package expertostech.dio.lombok.controller;

import expertostech.dio.lombok.model.OrderModel;
import expertostech.dio.lombok.repository.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<OrderModel>> listAll() {
        return ResponseEntity.ok(orderRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<OrderModel> save(@RequestBody OrderModel orderModel) {
        return ResponseEntity.ok(orderRepository.save(orderModel));
    }
}
