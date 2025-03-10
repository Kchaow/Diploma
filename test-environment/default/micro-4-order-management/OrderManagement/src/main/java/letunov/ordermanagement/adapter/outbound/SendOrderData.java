package letunov.ordermanagement.adapter.outbound;

import letunov.ordermanagement.adapter.outbound.dto.CreateOrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SendOrderData {
    @Value("${integration.order-processing-url}")
    String productCatalogManagementUrl;

    void execute(CreateOrderDto dto) {
        WebClient.create(productCatalogManagementUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
