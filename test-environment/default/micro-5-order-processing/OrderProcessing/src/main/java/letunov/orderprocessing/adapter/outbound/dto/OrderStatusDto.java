package letunov.orderprocessing.adapter.outbound.dto;

public record OrderStatusDto(String orderId, String clientId, String newStatus, String message) {
}
