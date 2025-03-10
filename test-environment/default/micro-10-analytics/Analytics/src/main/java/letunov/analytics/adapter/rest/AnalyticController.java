package letunov.analytics.adapter.rest;

import letunov.analytics.adapter.rest.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticController {
    @PutMapping("/analytics/inventory")
    public ResponseEntity<Void> updateInventoryState(@RequestBody ItemDto itemDto) {
        return ResponseEntity.ok().build();
    }
}
