package letunov.contracts.dto;

public record OrderStatusDto(String orderId, String clientId, String newStatus, String message) {
}
