package letunov.emailservice.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.LogEmailContract;
import letunov.contracts.dto.EmailLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "logging")
public class LogEmail implements LogEmailContract {
    @Value("${integration.logging-url}")
    private String loggingUrl;

    @Override
    public ResponseEntity<Void> logEmail(EmailLogDto dto) {
        return WebClient.create(loggingUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
