package letunov.emailservice.adapter.outbound;

import letunov.contracts.dto.EmailLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final LogEmail logEmail;

    @GetMapping("/logging")
    public ResponseEntity<Void> micro12() {
        return logEmail.logEmail(new EmailLogDto("1", "recipient", "status"));
    }
}
