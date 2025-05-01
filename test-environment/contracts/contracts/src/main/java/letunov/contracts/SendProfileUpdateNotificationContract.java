package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ProfileUpdateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendProfileUpdateNotificationContract extends Contract {
    @PostMapping
    ResponseEntity<Void> sendProfileUpdateNotification(@RequestBody ProfileUpdateDto dto);
}
