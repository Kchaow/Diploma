package letunov.orderprocessing.adapter.outbound.dto;

public record OrderConfirmationDto(String orderId, String clientId, String confirmationMessage) {
}
