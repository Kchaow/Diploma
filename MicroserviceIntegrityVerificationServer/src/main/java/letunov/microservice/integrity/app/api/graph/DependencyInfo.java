package letunov.microservice.integrity.app.api.graph;

import lombok.Data;

@Data
public class DependencyInfo {
    private String groupId;
    private String artifactId;
    private String version;
}
