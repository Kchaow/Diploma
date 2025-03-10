package letunov.notifications.adapter.rest.dto;

public record OrderConfirmationDto(String orderId, String clientId, String confirmationMessage) {
}
