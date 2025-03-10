package letunov.notifications.adapter.rest.dto;

public record OrderStatusDto(String orderId, String clientId, String newStatus, String message) {
}
