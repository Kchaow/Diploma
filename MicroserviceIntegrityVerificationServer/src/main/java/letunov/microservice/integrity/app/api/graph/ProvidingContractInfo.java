package letunov.microservice.integrity.app.api.graph;

import lombok.Data;

@Data
public class ProvidingContractInfo {
    private String name;
    private String checksum;
    private DependencyInfo dependencyInfo;
}
