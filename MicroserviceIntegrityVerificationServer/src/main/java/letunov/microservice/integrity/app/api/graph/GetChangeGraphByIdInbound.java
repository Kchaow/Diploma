package letunov.microservice.integrity.app.api.graph;

import letunov.microservice.integrity.domain.graph.ChangeGraph;
import letunov.microservice.integrity.domain.graph.Graph;

public interface GetChangeGraphByIdInbound {
    ChangeGraph execute(String id);
}
