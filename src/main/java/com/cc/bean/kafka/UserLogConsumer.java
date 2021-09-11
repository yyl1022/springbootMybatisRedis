package com.cc.bean.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 创建消息消费者 (消息的发送直接使用KafkaTemplate模板即可,都封装好了,直接使用)
 *
 * @author [jiangbohao]
 * @Date: 2020/7/4
 */
@Component
public class UserLogConsumer {
    @KafkaListener(topics = {"user-log"})
    public void consumer(ConsumerRecord<?,?> consumerRecord){
        //判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        System.out.println(">>>>>>>>>> record =" + kafkaMessage);
        if(kafkaMessage.isPresent()){
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息:"+message);
        }
    }

    // 消费机制是通过监听器实现的,直接使用这个注解接口,它可以根据指定的条件进行消息的监听
}
