package letunov.productcatalogmanagement.adapter.rest;

import letunov.productcatalogmanagement.adapter.rest.dto.ItemDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class ProductCatalogManagementController {
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
