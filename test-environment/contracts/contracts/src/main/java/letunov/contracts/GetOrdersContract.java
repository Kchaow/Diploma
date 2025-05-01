package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GetOrdersContract extends Contract {
    @GetMapping("/clients/{clientId}/orders")
    ResponseEntity<List<OrderDto>> getOrders(@PathVariable String clientId);
}
