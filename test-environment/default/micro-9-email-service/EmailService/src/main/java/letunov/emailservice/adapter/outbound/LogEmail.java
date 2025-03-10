package letunov.emailservice.adapter.outbound;

import letunov.emailservice.adapter.outbound.dto.EmailLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class LogEmail {
    @Value("${integration.logging-url}")
    private String loggingUrl;

    public void execute(EmailLogDto dto) {
        WebClient.create(loggingUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
