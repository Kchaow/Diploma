package letunov.microservice.integrity.adapter.persistence.graph;

import letunov.microservice.integrity.domain.graph.ChangeGraph;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeGraphMongodbRepository extends MongoRepository<ChangeGraph, String> {

}
