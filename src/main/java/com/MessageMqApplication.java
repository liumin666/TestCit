package com;

//import com.liumin.study.rabbitmqweb.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MessageMqApplication {

//    @Autowired
//    private HelloSender helloSender;

    public static void main(String[] args) {
        SpringApplication.run(MessageMqApplication.class, args);
        System.out.println("server is run...");
    }

    @RequestMapping("pushMessage")
    @ResponseBody
    public String pushMessage(){
//        helloSender.send();

        return System.currentTimeMillis()+"";
    }
}
