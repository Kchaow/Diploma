package letunov.mojo;

import letunov.impl.MicroserviceIntegrityServerClient;
import letunov.impl.RetrieveMicroserviceContractsInfoDelegate;
import lombok.extern.slf4j.Slf4j;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "verifyMicroservice")
@Slf4j
public class VerifyMicroserviceMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", readonly = true)
    private MavenProject project;
    @Parameter
    private String m2Repo;
    @Parameter
    private String microserviceIntegrityServerBaseURL;

    @Override
    public void execute() {
        var delegate = new RetrieveMicroserviceContractsInfoDelegate();
        var microserviceContractsInfo = delegate.execute(m2Repo, project);
        log.info("Microservice contracts information retrieved: {}", microserviceContractsInfo);

        var microserviceIntegrityServerClient = new MicroserviceIntegrityServerClient(microserviceIntegrityServerBaseURL);
        var verificationInfo = microserviceIntegrityServerClient.verifyMicroservice(microserviceContractsInfo);

        log.info("======================================================");
        log.info("");
        if (verificationInfo.messages().isEmpty()) {
            log.info("No problems found");
        } else {
            log.info("Problems:");
            verificationInfo.messages().forEach(log::info);
            log.info("----------------------------------------------");
        }
        log.info("Changes graph url: {}", verificationInfo.graphLink());
        log.info("");
        log.info("======================================================");
    }
}
