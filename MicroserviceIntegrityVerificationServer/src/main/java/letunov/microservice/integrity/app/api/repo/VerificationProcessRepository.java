package letunov.microservice.integrity.app.api.repo;

import letunov.microservice.integrity.domain.verification.process.VerificationProcess;
import letunov.microservice.integrity.domain.verification.process.VerificationProcessStatus;

import java.util.Optional;

public interface VerificationProcessRepository {
    Optional<VerificationProcess> findByAssociatedMicroservicesContainsAndStatus(String associatedMicroservice, VerificationProcessStatus status);
}
