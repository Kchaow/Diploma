package letunov.contract;

import letunov.contract.dto.NotificationLogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface LogNotificationContract extends Contract {
    @RequestMapping(path = "/notification", method = RequestMethod.POST)
    ResponseEntity<Void> logNotification(@RequestBody NotificationLogDto notificationLogDto);
}
