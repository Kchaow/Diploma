package letunov.warehousemanagement.adapter.rest.dto;

import java.util.List;

public record ReserveItemsDto(String orderId, List<ItemDto> items) {
}
