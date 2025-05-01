package letunov.microservice.integrity.app.api.graph;

import lombok.Data;

@Data
public class ConsumingContractInfo {
    private String name;
    private String serviceName;
    private String checksum;
    private DependencyInfo dependencyInfo;
}
