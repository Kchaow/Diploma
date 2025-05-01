package letunov.contracts.dto;

public record OrderConfirmationDto(String orderId, String clientId, String confirmationMessage) {
}
