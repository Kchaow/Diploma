package letunov.notifications.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contracts.SendConfirmationNotificationContract;
import letunov.contracts.SendOrderStatusNotificationContract;
import letunov.contracts.SendProfileUpdateNotificationContract;
import letunov.contracts.SendWelcomeNotificationContract;
import letunov.contracts.dto.OrderConfirmationDto;
import letunov.contracts.dto.OrderStatusDto;
import letunov.contracts.dto.ProfileUpdateDto;
import letunov.contracts.dto.WelcomeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
@ContractProvider
public class NotificationsController implements SendOrderStatusNotificationContract, SendConfirmationNotificationContract,
    SendProfileUpdateNotificationContract, SendWelcomeNotificationContract {
    @Override
    @PostMapping("/order-status")
    public ResponseEntity<Void> sendOrderStatusNotification(@RequestBody OrderStatusDto orderStatusDto) {
        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping("/welcome")
    public ResponseEntity<Void> sendWelcomeNotification(@RequestBody WelcomeDto welcomeDto) {
        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping("/profile-update")
    public ResponseEntity<Void> sendProfileUpdateNotification(@RequestBody ProfileUpdateDto profileUpdateDto) {
        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping("/order-confirmation")
    public ResponseEntity<Void> sendOrderConfirmationNotification(@RequestBody OrderConfirmationDto orderConfirmationDto) {
        return ResponseEntity.ok().build();
    }
}
