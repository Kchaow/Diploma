package letunov.microservice.integrity.adapter.rest.mapper;

import letunov.microservice.integrity.adapter.rest.dto.*;
import letunov.microservice.integrity.app.api.graph.*;
import letunov.microservice.integrity.app.api.verification.VerificationInfo;
import letunov.microservice.integrity.domain.contract.Edge;
import letunov.microservice.integrity.domain.contract.Node;
import letunov.microservice.integrity.domain.graph.Graph;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GraphMapper {
    GraphDto toGraphDto(Graph graph);

    NodeDto toNodeDto(Node node);

    EdgeDto toEdgeDto(Edge edge);

    @Mapping(target = "name", source = "microserviceName")
    @Mapping(target = "providingContractInfoList", source = "providing")
    @Mapping(target = "consumingContractInfoList", source = "consuming")
    MicroserviceInfo toMicroserviceInfo(MicroserviceDto microserviceDto);

    @Mapping(target = "dependencyInfo", source = "dependency")
    ProvidingContractInfo toProvidingContractInfo(ProvidingContractDto providingContractDto);

    @Mapping(target = "dependencyInfo", source = "dependency")
    ConsumingContractInfo toConsumingContractInfo(ConsumingContractDto consumingContractDto);

    DependencyInfo toDependencyInfo(DependencyDto dependencyDto);

    VerificationDto toVerificationDto(VerificationInfo verificationInfo);
}
