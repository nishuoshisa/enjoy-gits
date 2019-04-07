package com.lzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 胡梦娟 on 2018/11/27.
 */
@RestController
@RequestMapping("login")
public class LoginController {


    @RequestMapping("/")
    String home(){
        return "hello 我是朱炎，我在学计算机!";
    }


}
