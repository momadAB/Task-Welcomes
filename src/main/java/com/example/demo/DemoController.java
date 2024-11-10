package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    // Input must be in URL (Ex. "/greet?name="Ahmed"")
    @GetMapping("/greet")
    public String greetResponse(@RequestParam(defaultValue = "World") String name) {
        return String.format("Hello, %s!%n", name);
    }

    // Input must be a JSON object in the format of FarewellObject. Extra fields are fine though and ignored
    // {
    //  "name": "Ahmed"
    // }
    @PostMapping("/farewell")
    public MessageObject farewellResponse(@RequestBody FarewellObject body) {
        return new MessageObject(String.format("Goodbye, %s!", body.getName()));
    }
}
