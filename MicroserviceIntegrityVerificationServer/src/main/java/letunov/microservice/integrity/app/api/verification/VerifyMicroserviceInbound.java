package letunov.microservice.integrity.app.api.verification;

import letunov.microservice.integrity.app.api.graph.MicroserviceInfo;

public interface VerifyMicroserviceInbound {
    VerificationInfo execute(MicroserviceInfo microserviceInfo);
}
