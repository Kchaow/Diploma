package letunov.clientmanagement.adapter.outbound;

import letunov.contracts.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/out")
public class OutboundController {
    private final GetOrders getOrders;

    @GetMapping("/order-processing")
    public ResponseEntity<List<OrderDto>> micro5() {
        return getOrders.getOrders("1");
    }
}
