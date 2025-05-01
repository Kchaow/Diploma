package letunov.clientprofiles.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.SendWelcomeNotificationContract;
import letunov.contracts.dto.WelcomeDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "notifications")
public class SendWelcomeNotification implements SendWelcomeNotificationContract {
    @Value("${integration.notifications-url}")
    private String notificationsUrl;

    @Override
    public ResponseEntity<Void> sendWelcomeNotification(WelcomeDto dto) {
        return WebClient.create(notificationsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
