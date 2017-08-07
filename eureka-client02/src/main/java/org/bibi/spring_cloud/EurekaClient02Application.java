package org.bibi.spring_cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient02Application.class, args);
	}

	@Value("${server.port}")
	private String port;

	@Value("${spring.application.name}")
	private String application_name;


	@GetMapping("/hello")
	public String home(@RequestParam String name) {
		return "hello " + name + " [client: " + application_name + ", port:" +port + "]";
	}
}
