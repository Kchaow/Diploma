package letunov.microservice.integrity.adapter.rest;

import io.swagger.v3.oas.annotations.Operation;
import letunov.microservice.integrity.adapter.rest.dto.GraphDto;
import letunov.microservice.integrity.adapter.rest.dto.MicroserviceDto;
import letunov.microservice.integrity.adapter.rest.dto.VerificationDto;
import letunov.microservice.integrity.adapter.rest.mapper.GraphMapper;
import letunov.microservice.integrity.app.api.graph.GetGraphByIdInbound;
import letunov.microservice.integrity.app.api.graph.GetGraphInbound;
import letunov.microservice.integrity.app.api.graph.UpdateGraphWithMicroserviceInbound;
import letunov.microservice.integrity.app.api.verification.VerifyGraphInbound;
import letunov.microservice.integrity.app.api.verification.VerifyMicroserviceInbound;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/graph")
@CrossOrigin(origins = "*")
@Slf4j
@RequiredArgsConstructor
public class MicroserviceIntegrityController {
    private final UpdateGraphWithMicroserviceInbound updateGraphWithMicroserviceInbound;
    private final GetGraphInbound getGraphInbound;
    private final GraphMapper graphMapper;
    private final VerifyMicroserviceInbound verifyMicroserviceInbound;
    private final GetGraphByIdInbound getGraphByIdInbound;
    private final VerifyGraphInbound verifyGraphInbound;

    @Operation(summary = "Изменение графа")
    @PostMapping("/microservice")
    public void updateGraph(@RequestBody MicroserviceDto microserviceDto) {
        log.info("[updateGraph] request; microserviceDto: {}", microserviceDto);
        var microserviceInfo = graphMapper.toMicroserviceInfo(microserviceDto);
        updateGraphWithMicroserviceInbound.execute(microserviceInfo);
    }

    @Operation(summary = "Получение всего графа")
    @GetMapping
    public ResponseEntity<GraphDto> getGraph() {
        log.info("[getGraph] request;");
        var graph = getGraphInbound.execute();
        return ResponseEntity.ok(graphMapper.toGraphDto(graph));
    }

    @Operation(summary = "Получение графа изменений по id")
    @GetMapping("/{id}")
    public ResponseEntity<GraphDto> getGraphById(@PathVariable String id) {
        log.info("[getGraphById] request; id: {}", id);
        var graph = getGraphByIdInbound.execute(id);
        return ResponseEntity.ok(graphMapper.toGraphDto(graph));
    }

    @Operation(summary = "Создание графа изменений")
    @PostMapping("/verify")
    public ResponseEntity<VerificationDto> verify(@RequestBody MicroserviceDto microserviceDto) {
        log.info("[verify] request; microserviceDto: {}", microserviceDto);
        var verificationInfo = verifyMicroserviceInbound.execute(graphMapper.toMicroserviceInfo(microserviceDto));
        return ResponseEntity.ok(graphMapper.toVerificationDto(verificationInfo));
    }

    @Operation(summary = "Обновление графа")
    @PostMapping("/update")
    public void updateGraph() {
        log.info("[updateGraph] request;");
        verifyGraphInbound.execute();
    }
}
