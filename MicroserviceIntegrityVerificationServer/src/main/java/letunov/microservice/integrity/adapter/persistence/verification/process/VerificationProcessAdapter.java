package letunov.microservice.integrity.adapter.persistence.verification.process;

import letunov.microservice.integrity.app.api.repo.VerificationProcessRepository;
import letunov.microservice.integrity.domain.verification.process.VerificationProcess;
import letunov.microservice.integrity.domain.verification.process.VerificationProcessStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class VerificationProcessAdapter implements VerificationProcessRepository {
    private final VerificationProcessMongodbRepository verificationProcessMongodbRepository;

    @Override
    public Optional<VerificationProcess> findByAssociatedMicroservicesContainsAndStatus(String associatedMicroservice, VerificationProcessStatus status) {
        return verificationProcessMongodbRepository.findByAssociatedMicroservicesContainsAndStatus(associatedMicroservice, status);
    }
}
