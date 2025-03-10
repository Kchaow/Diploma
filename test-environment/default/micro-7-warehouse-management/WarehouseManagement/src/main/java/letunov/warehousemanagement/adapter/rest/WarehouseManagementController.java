package letunov.warehousemanagement.adapter.rest;

import letunov.warehousemanagement.adapter.rest.dto.ReserveItemsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseManagementController {
    @PutMapping("/inventory/reserve")
    public ResponseEntity<Void> reserveItems(@RequestBody ReserveItemsDto reserveItemsDto) {
        return ResponseEntity.ok().build();
    }
}
