package org.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }
    @GetMapping("/url")
    @ResponseBody
    String hello2() {
        return "22";
    }

    @GetMapping("/url2")
    @ResponseBody
    String hello3() {
        return "<h4>22</h4>";
    }

}
