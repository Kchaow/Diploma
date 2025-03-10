package letunov.reports.adapter.outbound;

import letunov.reports.adapter.outbound.dto.ReportLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class LogReport {
    @Value("${integration.logging-url}")
    private String loggingUrl;

    public void execute(ReportLogDto dto) {
        WebClient.create(loggingUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
