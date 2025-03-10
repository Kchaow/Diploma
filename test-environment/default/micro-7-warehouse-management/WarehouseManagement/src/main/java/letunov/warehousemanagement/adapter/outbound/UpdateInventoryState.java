package letunov.warehousemanagement.adapter.outbound;

import letunov.warehousemanagement.adapter.rest.dto.ItemDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class UpdateInventoryState {
    @Value("${integration.analytics-url}")
    private String analyticsUrl;

    public void execute(ItemDto dto) {
        WebClient.create(analyticsUrl)
                .post()
                .bodyValue(dto)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
