package letunov.orderprocessing.adapter.outbound;

import letunov.orderprocessing.adapter.outbound.dto.OrderConfirmationDto;
import letunov.orderprocessing.adapter.outbound.dto.OrderStatusDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final SendConfirmationNotification sendConfirmationNotification;
    private final SendOrderStatusNotification sendOrderStatusNotification;

    @GetMapping("/notifications/confirmation")
    public ResponseEntity<Void> micro8_1() {
        sendConfirmationNotification.execute(new OrderConfirmationDto("1", "1", "message"));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/notifications/order-status")
    public ResponseEntity<Void> micro8_2() {
        sendOrderStatusNotification.execute(new OrderStatusDto("1", "1", "message", "message"));
        return ResponseEntity.ok().build();
    }
}
