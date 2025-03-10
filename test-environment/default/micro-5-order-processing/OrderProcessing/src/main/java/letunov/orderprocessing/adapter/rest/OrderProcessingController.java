package letunov.orderprocessing.adapter.rest;

import letunov.orderprocessing.adapter.rest.dto.CreateOrderDto;
import letunov.orderprocessing.adapter.rest.dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.List.of;

@RestController
public class OrderProcessingController {
    @GetMapping("/clients/{clientId}/orders")
    public ResponseEntity<List<OrderDto>> getOrders(@PathVariable("clientId") String clientId) {
        return switch (clientId) {
            case "1" -> ResponseEntity.ok(of(new OrderDto("1", "order of 1")));
            case "2" -> ResponseEntity.ok(of(new OrderDto("2", "order of 2")));
            case "3" -> ResponseEntity.ok(of(new OrderDto("3", "order of 3")));
            default -> ResponseEntity.notFound().build();
        };
    }

    @PostMapping("/orders")
    public ResponseEntity<Void> createOrder(@RequestBody CreateOrderDto createOrderDto) {
        return ResponseEntity.ok().build();
    }
}
