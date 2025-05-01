package letunov.emailservice.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contracts.SendEmailContract;
import letunov.contracts.dto.EmailLogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ContractProvider
public class EmailServiceController implements SendEmailContract {
    @Override
    @PostMapping("/email/send")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailLogDto emailDto) {
        return ResponseEntity.ok().build();
    }
}
