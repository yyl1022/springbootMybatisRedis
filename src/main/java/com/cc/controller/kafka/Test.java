package com.cc.controller.kafka;

import com.cc.bean.kafka.UserLogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author [jiangbohao]
 * @Date: 2020/7/4
 */

@Component
public class Test {

    @Autowired
    private UserLogProducer userLogProducer;


    @PostConstruct
    public void init() {
        for (int i = 0; i < 8; i++) {
            //调用消息发送类中的消息发送方法
            userLogProducer.sendLog(String.valueOf(i));
        }

    }

}