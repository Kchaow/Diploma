package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UpdateInventoryStateContract extends Contract {
    @PutMapping("/analytics/inventory")
    ResponseEntity<Void> updateInventoryState(@RequestBody ItemDto itemDto);
}
