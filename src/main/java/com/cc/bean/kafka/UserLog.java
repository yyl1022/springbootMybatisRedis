package com.cc.bean.kafka;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author 18011618
 * @Description 定义用户发送的日志数据     首先定义一个bean用来发送消息的载体 kafka
 * @Date 14:42 2018/7/20
 * @Modify By
 */
@Data
@Accessors(chain = true)
public class UserLog {
    private String username;
    private String userid;
    private String state;


}

