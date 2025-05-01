package letunov.contracts.dto;

import java.util.List;

public record ReserveItemsDto(String orderId, List<ItemDto> items) {
}
