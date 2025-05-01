package letunov.microservice.integrity.app.api.graph;

import letunov.microservice.integrity.domain.graph.Graph;

public interface GetGraphByIdInbound {
    Graph execute(String id);
}
