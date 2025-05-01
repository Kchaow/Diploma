package letunov.microservice.integrity.app.impl.graph;

import letunov.microservice.integrity.app.api.graph.GetGraphByIdInbound;
import letunov.microservice.integrity.app.api.graph.exception.GraphNotFoundException;
import letunov.microservice.integrity.app.api.repo.GraphRepository;
import letunov.microservice.integrity.domain.graph.Graph;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetGraphByIdUseCase implements GetGraphByIdInbound {
    private final GraphRepository graphRepository;

    @Override
    public Graph execute(String id) {
        return graphRepository.findById(id)
            .orElseThrow(() -> new GraphNotFoundException(id));
    }
}
