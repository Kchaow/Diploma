package letunov.ordermanagement.adapter.outbound;

import letunov.ordermanagement.adapter.outbound.dto.CreateOrderDto;
import letunov.ordermanagement.adapter.outbound.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/out")
public class OutboundController {
    private final GetItems getItems;
    private final SendOrderData sendOrderData;

    @GetMapping("/product-catalog-management")
    public ResponseEntity<List<ItemDto>> micro1() {
        return ResponseEntity.ok(getItems.execute());
    }

    @GetMapping("/order-processing")
    public ResponseEntity<List<ItemDto>> micro5() {
        sendOrderData.execute(new CreateOrderDto("1", new ArrayList<>(), 10, LocalDate.now().toString()));
        return ResponseEntity.ok().build();
    }
}
