package letunov.analytics.adapter.rest.dto;

public record ItemDto(String itemId, int stockLevel, int reservedQuantity) {
}
