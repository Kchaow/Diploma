package letunov.analytics.adapter.outbound;

import letunov.analytics.adapter.outbound.dto.ReportDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendDataForReport {
    @Value("${integration.reports-url}")
    private String reportsUrl;

    public void execute(ReportDto dto) {
        WebClient.create(reportsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
