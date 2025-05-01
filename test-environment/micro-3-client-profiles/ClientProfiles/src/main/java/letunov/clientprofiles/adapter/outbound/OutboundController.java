package letunov.clientprofiles.adapter.outbound;

import letunov.contracts.dto.ProfileUpdateDto;
import letunov.contracts.dto.WelcomeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final SendWelcomeNotification sendWelcomeNotification;
    private final SendProfileUpdateNotification profileUpdateNotification;

    @GetMapping("/notifications/welcome")
    public ResponseEntity<Void> micro8_1() {
        return sendWelcomeNotification.sendWelcomeNotification(new WelcomeDto("1", "message"));
    }

    @GetMapping("/notifications/profile-update")
    public ResponseEntity<Void> micro8_2() {
        return profileUpdateNotification.sendProfileUpdateNotification(new ProfileUpdateDto("1", "message", "me"));
    }
}
