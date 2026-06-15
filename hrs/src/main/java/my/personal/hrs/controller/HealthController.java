package my.personal.hrs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("ping")
    public String health(){
        return "PONG";
    }

}
