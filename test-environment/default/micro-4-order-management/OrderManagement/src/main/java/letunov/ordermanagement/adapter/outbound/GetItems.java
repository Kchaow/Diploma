package letunov.ordermanagement.adapter.outbound;

import letunov.ordermanagement.adapter.outbound.dto.ItemDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class GetItems {
    @Value("${integration.product-catalog-management-url}")
    String productCatalogManagementUrl;

    public List<ItemDto> execute() {
        return WebClient.create(productCatalogManagementUrl)
                .get()
                .uri("/catalog/items")
                .retrieve()
                .toEntityList(ItemDto.class)
                .block()
                .getBody();
    }
}
