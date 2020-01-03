package life.yangbo.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CREATE BY YB ON 2020/1/3 9:24
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @GetMapping("/git")
    public String sayHi(){
        return "l love git ！！！";
    }
}
