package letunov.orderprocessing.adapter.outbound;

import letunov.orderprocessing.adapter.outbound.dto.OrderStatusDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendOrderStatusNotification {
    @Value("${integration.notifications-url}")
    private String notificationsUrl;

    public void execute(OrderStatusDto dto) {
        WebClient.create(notificationsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
