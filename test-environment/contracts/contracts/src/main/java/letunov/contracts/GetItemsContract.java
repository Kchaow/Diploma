package letunov.contracts;

import letunov.contract.Contract;
import letunov.contracts.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface GetItemsContract extends Contract {
    @GetMapping("/catalog/items")
    ResponseEntity<List<ItemDto>> getItems();
}
