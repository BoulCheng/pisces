package so.dian.pisces.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PreloadController {
    @GetMapping("/preload")
    public String preload() {
        return "ok";
    }
}