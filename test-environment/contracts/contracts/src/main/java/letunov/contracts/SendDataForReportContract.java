package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ReportDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SendDataForReportContract extends Contract {
    @PostMapping("/reports/generate")
    ResponseEntity<Void> sendDataForReport(@RequestBody ReportDto dto);
}
