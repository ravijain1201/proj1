package com.example.Proj1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RestController {
    @GetMapping("/v1")
    public @ResponseBody String getBook() {
        return "Hello from Rest Service test app2 8040";
    }
}
