package letunov.reports.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.LogReportContract;
import letunov.contracts.dto.ReportLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "logging")
public class LogReport implements LogReportContract {
    @Value("${integration.logging-url}")
    private String loggingUrl;

    @Override
    public ResponseEntity<Void> logReport(ReportLogDto dto) {
        return WebClient.create(loggingUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
