package letunov.clientprofiles.adapter.outbound;

import letunov.clientprofiles.adapter.outbound.dto.ProfileUpdateDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendProfileUpdateNotification {
    @Value("${integration.notifications-url}")
    private String notificationsUrl;

    public void execute(ProfileUpdateDto dto) {
        WebClient.create(notificationsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
