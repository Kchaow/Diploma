package letunov.clientmanagement.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.GetOrdersContract;
import letunov.contracts.dto.OrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
@ContractConsumer(serviceName = "order-processing")
public class GetOrders implements GetOrdersContract {
    @Value("${integration.order-processing-url}")
    private String orderProcessingUrl;

    @Override
    public ResponseEntity<List<OrderDto>> getOrders(String clientId) {
        return WebClient.create(orderProcessingUrl)
                .get()
                .uri("/clients/{clientId}/orders", clientId)
                .retrieve()
                .toEntityList(OrderDto.class)
                .block();
    }
}
