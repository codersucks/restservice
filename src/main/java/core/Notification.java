package core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notification {
    @RequestMapping(value = "/VIID/SubscribeNotifications",method =RequestMethod.POST)
    public ResponseEntity<String> notify(@RequestBody String request) {
        //TODO
        return new ResponseEntity<String>();
    }

}
