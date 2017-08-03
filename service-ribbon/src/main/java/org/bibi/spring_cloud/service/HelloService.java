package org.bibi.spring_cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Author：Tom
 * Date：2017/8/3
 * Email：84048715@qq.com
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT01/hello?name=" + name, String.class);
    }
}
