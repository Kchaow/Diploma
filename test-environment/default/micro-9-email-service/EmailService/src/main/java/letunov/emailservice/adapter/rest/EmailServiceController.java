package letunov.emailservice.adapter.rest;

import letunov.emailservice.adapter.rest.dto.EmailDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailServiceController {
    @PostMapping("/email/send")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDto emailDto) {
        return ResponseEntity.ok().build();
    }
}
