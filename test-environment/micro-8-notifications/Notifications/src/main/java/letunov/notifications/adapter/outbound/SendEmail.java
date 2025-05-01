package letunov.notifications.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.SendEmailContract;
import letunov.contracts.dto.EmailLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "email-service")
public class SendEmail implements SendEmailContract {
    @Value("${integration.email-service-url}")
    private String emailServiceUrl;

    @Override
    public ResponseEntity<Void> sendEmail(EmailLogDto dto) {
        return WebClient.create(emailServiceUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
