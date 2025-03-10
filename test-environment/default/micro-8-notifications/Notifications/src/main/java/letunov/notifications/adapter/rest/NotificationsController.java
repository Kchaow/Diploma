package letunov.notifications.adapter.rest;

import letunov.notifications.adapter.rest.dto.OrderConfirmationDto;
import letunov.notifications.adapter.rest.dto.OrderStatusDto;
import letunov.notifications.adapter.rest.dto.ProfileUpdateDto;
import letunov.notifications.adapter.rest.dto.WelcomeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {
    @PostMapping("/order-status")
    public ResponseEntity<Void> sendOrderStatusNotification(@RequestBody OrderStatusDto orderStatusDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/welcome")
    public ResponseEntity<Void> sendWelcomeNotification(@RequestBody WelcomeDto welcomeDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/profile-update")
    public ResponseEntity<Void> sendProfileUpdateNotification(@RequestBody ProfileUpdateDto profileUpdateDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/order-confirmation")
    public ResponseEntity<Void> sendOrderConfirmationNotification(@RequestBody OrderConfirmationDto orderConfirmationDto) {
        return ResponseEntity.ok().build();
    }
}
