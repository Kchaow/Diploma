package letunov.warehousemanagement.adapter.outbound.dto;

public record ItemDto(String itemId, int stockLevel, int reservedQuantity) {
}
