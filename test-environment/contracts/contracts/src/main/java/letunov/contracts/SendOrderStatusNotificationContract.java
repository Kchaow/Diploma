package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.OrderStatusDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendOrderStatusNotificationContract extends Contract {
    @PostMapping
    ResponseEntity<Void> sendOrderStatusNotification(@RequestBody OrderStatusDto dto);
}
