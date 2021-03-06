package com.leyou.sms.listener;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuzhiqiang997
 * @date 2018/9/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsListenerTest {


    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void listenVerifyCode() throws InterruptedException {
        Map<String,String> msg = new HashMap<>();
	    msg.put("phone", "18280161808");
	    msg.put("code", "ILoveYou");
        amqpTemplate.convertAndSend("ly.sms.exchange","sms.verify.code",msg);

        Thread.sleep(5000L);
    }
}