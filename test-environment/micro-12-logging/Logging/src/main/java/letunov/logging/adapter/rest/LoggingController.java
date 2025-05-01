package letunov.logging.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contract.LogNotificationContract;
import letunov.contract.dto.NotificationLogDto;
import letunov.contracts.LogEmailContract;
import letunov.contracts.LogReportContract;
import letunov.contracts.dto.EmailLogDto;
import letunov.contracts.dto.ReportLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logs")
@RequiredArgsConstructor
@Controller
@ContractProvider
public class LoggingController implements LogNotificationContract, LogEmailContract, LogReportContract {
    @Override
    @PostMapping("/report")
    public ResponseEntity<Void> logReport(@RequestBody ReportLogDto reportLogDto) {
        return ResponseEntity.ok().build();
    }

    @Override
    @PostMapping("/email")
    public ResponseEntity<Void> logEmail(@RequestBody EmailLogDto emailLogDto) {
        return ResponseEntity.ok().build();
    }

    @Override
    @RequestMapping(path = "/notification", method = RequestMethod.POST)
    public ResponseEntity<Void> logNotification(@RequestBody NotificationLogDto notificationLogDto) {
        return ResponseEntity.ok().build();
    }
}
