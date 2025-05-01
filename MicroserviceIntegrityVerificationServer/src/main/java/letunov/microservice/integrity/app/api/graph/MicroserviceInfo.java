package letunov.microservice.integrity.app.api.graph;

import lombok.Data;

import java.util.List;

@Data
public class MicroserviceInfo {
    private String name;
    private List<ProvidingContractInfo> providingContractInfoList;
    private List<ConsumingContractInfo> consumingContractInfoList;
}
