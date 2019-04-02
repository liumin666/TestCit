package com.liumin.study.rabbitmqweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:lm
 * @Despriction:
 * @Date:2019/3/29 16:47
 */
@Controller
public class UserController {

    @RequestMapping("test")
    public String getUser(){

        return "ssageMqApplication on XS-20180208NJFO with PID 41996 (D:\\" ;
    }
}
