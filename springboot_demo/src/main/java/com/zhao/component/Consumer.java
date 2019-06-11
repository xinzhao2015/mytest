package com.zhao.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhao
 * @date 2019/6/10 11:01
 */
@Component
public class Consumer {
    @JmsListener(destination = "message")
    public void readMessage(String text){
        System.out.println("接受到消息:"+text);
    }


    @JmsListener(destination = "message_map")
    public void readMap(Map map){
        System.out.println(map);
    }

}
