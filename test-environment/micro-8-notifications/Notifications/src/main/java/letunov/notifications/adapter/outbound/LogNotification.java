package letunov.notifications.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contract.LogNotificationContract;
import letunov.contract.dto.NotificationLogDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "logging")
public class LogNotification implements LogNotificationContract {
    @Value("${integration.logging-service-url}")
    private String loggingServiceUrl;

    @Override
    public ResponseEntity<Void> logNotification(NotificationLogDto notificationLogDto) {
        return WebClient.create(loggingServiceUrl + "/notification")
            .post()
            .bodyValue(notificationLogDto)
            .retrieve()
            .toEntity(Void.class)
            .block();
    }
}
