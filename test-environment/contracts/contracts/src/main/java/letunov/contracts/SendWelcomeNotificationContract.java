package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.WelcomeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendWelcomeNotificationContract extends Contract {
    @PostMapping
    ResponseEntity<Void> sendWelcomeNotification(@RequestBody WelcomeDto dto);
}
