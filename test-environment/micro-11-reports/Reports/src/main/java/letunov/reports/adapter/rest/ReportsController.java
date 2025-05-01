package letunov.reports.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contracts.SendDataForReportContract;
import letunov.contracts.dto.ReportDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ContractProvider
public class ReportsController implements SendDataForReportContract {
    @Override
    @PostMapping("/reports/generate")
    public ResponseEntity<Void> sendDataForReport(@RequestBody ReportDto reportDto) {
        return ResponseEntity.ok().build();
    }
}
