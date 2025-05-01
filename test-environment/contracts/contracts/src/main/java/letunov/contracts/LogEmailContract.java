package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.EmailLogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface LogEmailContract extends Contract {
    @PostMapping
    ResponseEntity<Void> logEmail(@RequestBody EmailLogDto dto);
}
