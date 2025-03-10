package letunov.notifications.adapter.outbound;

import letunov.notifications.adapter.outbound.dto.EmailLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendEmail {
    @Value("${integration.email-service-url}")
    private String emailServiceUrl;

    public void execute(EmailLogDto dto) {
        WebClient.create(emailServiceUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
