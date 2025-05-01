package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ReportLogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface LogReportContract extends Contract {
    @PostMapping
    ResponseEntity<Void> logReport(@RequestBody ReportLogDto dto);
}
