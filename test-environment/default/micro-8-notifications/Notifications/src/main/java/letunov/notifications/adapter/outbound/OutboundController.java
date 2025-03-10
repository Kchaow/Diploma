package letunov.notifications.adapter.outbound;

import letunov.notifications.adapter.outbound.dto.EmailLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final SendEmail sendEmail;

    @GetMapping("/email-service")
    public ResponseEntity<Void> micro9() {
        sendEmail.execute(new EmailLogDto("id", "recipient", "status"));
        return ResponseEntity.ok().build();
    }
}
