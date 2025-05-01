package letunov.productcatalogmanagement.adapter.rest;

import letunov.contract.ContractProvider;
import letunov.contracts.GetItemsContract;
import letunov.contracts.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
@ContractProvider
public class ProductCatalogManagementController implements GetItemsContract {
    @Override
    @GetMapping("/items")
    public ResponseEntity<List<ItemDto>> getItems() {
        var items = List.of(
                new ItemDto("cars", true),
                new ItemDto("cloth", false),
                new ItemDto("toys", true)
        );
        return ResponseEntity.ok(items);
    }
}
