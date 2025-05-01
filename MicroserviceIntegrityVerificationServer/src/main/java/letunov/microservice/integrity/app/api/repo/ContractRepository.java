package letunov.microservice.integrity.app.api.repo;

import letunov.microservice.integrity.app.api.graph.ConsumingContractInfo;
import letunov.microservice.integrity.app.api.graph.ProvidingContractInfo;
import letunov.microservice.integrity.domain.contract.Contract;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ContractRepository {
    Map<String, List<Contract>> findProvidedContractsByMicroservices(List<String> microservicesNames);

    Map<String, List<Contract>> findRequiredContractsByMicroservices(String microserviceName);

    Optional<Contract> findIdentical(ProvidingContractInfo providingContractInfo);

    Optional<Contract> findIdentical(ConsumingContractInfo consumingContractInfo);

    void deleteAllWithoutRelationships();
}
