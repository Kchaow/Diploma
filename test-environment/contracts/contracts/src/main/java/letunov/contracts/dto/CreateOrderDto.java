package letunov.contracts.dto;

import java.util.List;

public record CreateOrderDto(String clientId, List<ItemDto> items, int totalAmount, String deliveryDate) {
}
