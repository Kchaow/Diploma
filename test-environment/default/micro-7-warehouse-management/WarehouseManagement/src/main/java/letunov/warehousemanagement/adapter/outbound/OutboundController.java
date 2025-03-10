package letunov.warehousemanagement.adapter.outbound;

import letunov.warehousemanagement.adapter.rest.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/out")
@RequiredArgsConstructor
public class OutboundController {
    private final UpdateInventoryState updateInventoryState;

    @GetMapping("/analytics")
    public ResponseEntity<Void> micro10() {
        updateInventoryState.execute(new ItemDto("1", 10));
        return ResponseEntity.ok().build();
    }
}
