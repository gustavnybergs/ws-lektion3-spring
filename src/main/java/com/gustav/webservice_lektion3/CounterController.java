package com.gustav.webservice_lektion3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    @GetMapping("/counter")
    public Counter getCounter() {
        return new Counter(1, 0); // valfria startvärden
    }
}
