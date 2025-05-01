package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.CreateOrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendOrderDataContract extends Contract {
    @PostMapping
    ResponseEntity<Void> sendOrderData(@RequestBody CreateOrderDto dto);
}
