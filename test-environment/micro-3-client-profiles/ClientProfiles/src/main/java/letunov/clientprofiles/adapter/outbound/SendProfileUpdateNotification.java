package letunov.clientprofiles.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.SendProfileUpdateNotificationContract;
import letunov.contracts.dto.ProfileUpdateDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "notifications")
public class SendProfileUpdateNotification implements SendProfileUpdateNotificationContract {
    @Value("${integration.notifications-url}")
    private String notificationsUrl;

    public ResponseEntity<Void> sendProfileUpdateNotification(ProfileUpdateDto dto) {
        return WebClient.create(notificationsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
