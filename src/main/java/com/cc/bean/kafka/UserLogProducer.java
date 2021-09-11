package com.cc.bean.kafka;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.Random;

/**
 * @author [jiangbohao]
 * @Date: 2020/7/4
 */
@Component
public class UserLogProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送数据   创建消息生产者
     *
     * @param userid
     */
    public void sendLog(String userid) {
        UserLog userLog = new UserLog();
        userLog.setUsername("jhp");
        userLog.setUserid(userid);
        userLog.setState("0");
        System.err.println("发送用户日志数据:" + userLog);
        kafkaTemplate.send("user-log", JSON.toJSONString(userLog));

    }
}

