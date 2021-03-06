package org.bibi.spring_cloud.controller;

import org.bibi.spring_cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author：Tom
 * Date：2017/8/3
 * Email：84048715@qq.com
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/feign_hello")
    public String hello(@RequestParam String name){
        return "feign " + helloService.hello(name);
    }

}
