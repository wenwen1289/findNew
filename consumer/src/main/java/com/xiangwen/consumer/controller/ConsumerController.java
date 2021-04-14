package com.xiangwen.consumer.controller;

import com.xiangwen.consumer.service.ConsumerService;
import com.xiangwen.consumer.service.ConsumerService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：消费端控制器
 * @Author :zks
 * @Date :16:18 2020/8/27
 */
@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ConsumerService1 consumerService1;

    /**方式一：RestTemplate调用
     * @return
     */
    @RequestMapping("getName")
    public String getName(){
        return consumerService.getName();
    }

    /**
     * 方式二：@FeignClient调用
     * @return
     */
    @RequestMapping("getName1")
    public String getName1(){
        return consumerService1.getName1();
    }


}
