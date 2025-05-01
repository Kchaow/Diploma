package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ReserveItemsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ReserveItemsContract extends Contract {
    @PutMapping("/inventory/reserve")
    ResponseEntity<Void> reserveItems(@RequestBody ReserveItemsDto reserveItemsDto);
}
