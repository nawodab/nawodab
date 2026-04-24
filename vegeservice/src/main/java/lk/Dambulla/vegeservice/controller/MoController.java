package lk.Dambulla.vegeservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sms")
public class MoController {

    @PostMapping("/mo")
    public ResponseEntity<String> receiveMo(@RequestBody(required = false) String body) {
        System.out.println("MO received: " + body);
        return ResponseEntity.ok("OK");
    }
}
