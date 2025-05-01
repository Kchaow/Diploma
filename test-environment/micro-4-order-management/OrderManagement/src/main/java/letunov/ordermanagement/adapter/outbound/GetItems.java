package letunov.ordermanagement.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.GetItemsContract;
import letunov.contracts.dto.ItemDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
@ContractConsumer(serviceName = "product-catalog-management")
public class GetItems implements GetItemsContract {
    @Value("${integration.product-catalog-management-url}")
    String productCatalogManagementUrl;

    @Override
    public ResponseEntity<List<ItemDto>> getItems() {
        return WebClient.create(productCatalogManagementUrl)
            .get()
            .uri("/catalog/items")
            .retrieve()
            .toEntityList(ItemDto.class)
            .block();
    }
}
