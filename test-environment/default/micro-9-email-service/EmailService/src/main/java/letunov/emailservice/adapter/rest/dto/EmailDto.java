package letunov.emailservice.adapter.rest.dto;

public record EmailDto(String clientId, String email, String subject, String body) {
}
