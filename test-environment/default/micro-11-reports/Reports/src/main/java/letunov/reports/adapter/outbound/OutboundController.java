package letunov.reports.adapter.outbound;

import letunov.reports.adapter.outbound.dto.ReportLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final LogReport logReport;

    @GetMapping("/logging")
    public ResponseEntity<Void> micro12() {
        logReport.execute(new ReportLogDto("1", "type", "status"));
        return ResponseEntity.ok().build();
    }
}
