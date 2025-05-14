package letunov.microservice.integrity.domain.verification.process;

import letunov.microservice.integrity.domain.graph.Graph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class VerificationProcess {
    @MongoId
    private String id;
    private List<String> associatedMicroservices;
    private VerificationProcessStatus status;
    private Graph graph;
}
