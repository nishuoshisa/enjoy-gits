package com.lzz;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by 胡梦娟 on 2018/11/27.
 */
@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("/")
    public String homes(){
        return "hello woshizhuyan，wozaixuejisuanji!";
    }


}
