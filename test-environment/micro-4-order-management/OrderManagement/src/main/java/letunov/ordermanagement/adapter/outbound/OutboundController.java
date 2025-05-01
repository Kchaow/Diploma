package letunov.ordermanagement.adapter.outbound;

import letunov.contracts.dto.CreateOrderDto;
import letunov.contracts.dto.ItemDto;
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
        return getItems.getItems();
    }

    @GetMapping("/order-processing")
    public ResponseEntity<Void> micro5() {
        return sendOrderData.sendOrderData(new CreateOrderDto("1", new ArrayList<>(), 10, LocalDate.now().toString()));
    }
}
