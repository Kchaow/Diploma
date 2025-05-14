package letunov.microservice.integrity.app.impl.graph;

import letunov.microservice.integrity.app.api.graph.GetChangeGraphByIdInbound;
import letunov.microservice.integrity.app.api.repo.ChangeGraphRepository;
import letunov.microservice.integrity.domain.graph.ChangeGraph;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetChangeGraphByIdUseCase implements GetChangeGraphByIdInbound {
    private final ChangeGraphRepository changeGraphRepository;

    @Override
    public ChangeGraph execute(String id) {
        return changeGraphRepository.findById(id)
            .orElseThrow(() -> new RuntimeException());
    }
}
