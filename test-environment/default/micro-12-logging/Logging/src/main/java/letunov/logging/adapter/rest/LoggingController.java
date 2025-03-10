package letunov.logging.adapter.rest;

import letunov.logging.adapter.rest.dto.EmailLogDto;
import letunov.logging.adapter.rest.dto.NotificationLogDto;
import letunov.logging.adapter.rest.dto.ReportLogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LoggingController {
    @PostMapping("/report")
    public ResponseEntity<Void> logReport(@RequestBody ReportLogDto reportLogDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/email")
    public ResponseEntity<Void> logEmail(@RequestBody EmailLogDto emailLogDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/notification")
    public ResponseEntity<Void> logNotification(@RequestBody NotificationLogDto notificationLogDto) {
        return ResponseEntity.ok().build();
    }
}
