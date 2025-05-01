package letunov.ordermanagement.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.SendOrderDataContract;
import letunov.contracts.dto.CreateOrderDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@ContractConsumer(serviceName = "product-catalog-management")
public class SendOrderData implements SendOrderDataContract {
    @Value("${integration.order-processing-url}")
    String productCatalogManagementUrl;

    @Override
    public ResponseEntity<Void> sendOrderData(CreateOrderDto dto) {
        return WebClient.create(productCatalogManagementUrl)
            .post()
            .bodyValue(dto)
            .retrieve()
            .toBodilessEntity()
            .block();
    }
}
