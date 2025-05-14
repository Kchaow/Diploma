package letunov.microservice.integrity.app.api.change.graph;

import letunov.microservice.integrity.domain.graph.microservice.ChangeGraphStatus;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ChangeGraphsInfo {
    private String id;
    private int commitedMicroservices;
    private int associatedMicroservices;
    private ChangeGraphStatus status;
}
