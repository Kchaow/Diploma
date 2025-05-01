package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.OrderConfirmationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendConfirmationNotificationContract extends Contract {
    @PostMapping
    ResponseEntity<Void> sendOrderConfirmationNotification(@RequestBody OrderConfirmationDto dto);
}
