package com.lzz;

/**
 * @author 【享学课堂】 King老师
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/hello")
    public Object sayHello() {
        return "hello 我是朱炎，我最爱吹牛逼!!!";
    }
}

