package com.zhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhao
 * @date 2019/6/10 10:59
 */
@RestController
public class QueueController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/send")
    public void send(String text){
        jmsMessagingTemplate.convertAndSend("message",text);
    }

    @RequestMapping("/sendmap")
    public void sendMap(){
        Map<String, String> map = new HashMap<>();
        map.put("mobile","123456789");
        map.put("content","恭喜获得10元代金券");


        jmsMessagingTemplate.convertAndSend("message_map",map);
    }

    @RequestMapping("/sendsms")
    public void sendSms(){
        Map map = new HashMap<>();

        map.put("mobile","12345678910");
        map.put("template_code","SMS_85735065");
        map.put("sign_name","黑马");
        map.put("param","{\"number\":\"102931\"}");

    }

}
