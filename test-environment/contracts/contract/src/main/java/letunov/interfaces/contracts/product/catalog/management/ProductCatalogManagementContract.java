package letunov.interfaces.contracts.product.catalog.management;

import letunov.contract.Contract;
import letunov.interfaces.contracts.product.catalog.management.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductCatalogManagementContract extends Contract {
    @GetMapping("/catalog/items")
    ResponseEntity<List<ItemDto>> getItems();
}
