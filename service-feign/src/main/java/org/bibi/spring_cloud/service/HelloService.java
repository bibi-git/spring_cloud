package org.bibi.spring_cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * Author：Tom
 * Date：2017/8/3
 * Email：84048715@qq.com
 */
//调用服务名
@FeignClient(value = "EUREKA-CLIENT01")
public interface HelloService {
    @GetMapping("hello")
    //这里@RequestParam(value = "name") 一定要指定value
    public String hello(@RequestParam(value = "name") String name);
}
