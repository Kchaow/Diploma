package letunov.reports.adapter.rest;

import letunov.reports.adapter.rest.dto.ReportDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportsController {
    @PostMapping("/reports/generate")
    public ResponseEntity<Void> generateReport(@RequestBody ReportDto reportDto) {
        return ResponseEntity.ok().build();
    }
}
