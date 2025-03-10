package letunov.analytics.adapter.outbound;

import letunov.analytics.adapter.outbound.dto.ReportDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/out")
public class OutboundController {
    private final SendDataForReport sendDataForReport;

    @GetMapping("/reports")
    public ResponseEntity<Void> micro11() {
        sendDataForReport.execute(new ReportDto("type", "data", "generatedAt"));
        return ResponseEntity.ok().build();
    }
}
