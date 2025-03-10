package letunov.clientprofiles.adapter.outbound;

import letunov.clientprofiles.adapter.outbound.dto.ProfileUpdateDto;
import letunov.clientprofiles.adapter.outbound.dto.WelcomeDto;
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
        sendWelcomeNotification.execute(new WelcomeDto("1", "message"));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/notifications/profile-update")
    public ResponseEntity<Void> micro8_2() {
        profileUpdateNotification.execute(new ProfileUpdateDto("1", "message", "me"));
        return ResponseEntity.ok().build();
    }
}
