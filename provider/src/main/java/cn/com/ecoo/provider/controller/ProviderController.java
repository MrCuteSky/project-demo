package cn.com.ecoo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/hello")
    public Object hello() {
        return "hello, this is product service";
    }
}
