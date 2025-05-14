package letunov.microservice.integrity.adapter.persistence.verification.process;

import letunov.microservice.integrity.domain.verification.process.VerificationProcess;
import letunov.microservice.integrity.domain.verification.process.VerificationProcessStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface VerificationProcessMongodbRepository extends MongoRepository<VerificationProcess, String> {
    Optional<VerificationProcess> findByAssociatedMicroservicesContainsAndStatus(String associatedMicroservice, VerificationProcessStatus status);
}
