package letunov.notifications.adapter.rest;

import letunov.contracts.dto.EmailLogDto;
import letunov.notifications.adapter.outbound.SendEmail;
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
        return sendEmail.sendEmail(new EmailLogDto("id", "recipient", "status"));
    }
}
