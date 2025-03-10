package letunov.clientmanagement.adapter.outbound;

import letunov.clientmanagement.adapter.outbound.dto.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class GetOrders {
    @Value("${integration.order-processing-url}")
    private String orderProcessingUrl;

    public List<OrderDto> getOrders(String clientId) {
        return WebClient.create(orderProcessingUrl)
                .get()
                .uri("/clients/{clientId}/orders", clientId)
                .retrieve()
                .toEntityList(OrderDto.class)
                .block()
                .getBody();
    }
}
