package letunov.clientprofiles.adapter.outbound;

import letunov.clientprofiles.adapter.outbound.dto.WelcomeDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendWelcomeNotification {
    @Value("${integration.notifications-url}")
    private String notificationsUrl;

    public void execute(WelcomeDto dto) {
        WebClient.create(notificationsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
