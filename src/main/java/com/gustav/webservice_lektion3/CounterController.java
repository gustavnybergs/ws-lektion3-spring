package com.gustav.webservice_lektion3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CounterController {

    @GetMapping("/counter")
    public Counter getCounter() {
        return new Counter(1, 0); // valfria startvärden
    }


    @GetMapping("/counter/increment")
public Counter increment(@RequestParam(defaultValue = "1") int step) {
    if (step < 0) throw new IllegalArgumentException("step måste vara >= 0");
    return new Counter(1, 0 + step);
}
}
