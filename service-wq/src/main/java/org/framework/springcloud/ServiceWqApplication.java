package org.framework.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class ServiceWqApplication {

	private static final Logger log = LoggerFactory.getLogger(ServiceWqApplication.class);

	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/jiubo")
	public String home() {
		log.info("hi, im service-wq, being called");
		return "hello, i'm wq to be called";
	}

	@RequestMapping("/info")
	public String info() {
		log.info("hi, i'm wq calling info");
		return restTemplate.getForObject("http://localhost:9988/info", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceWqApplication.class, args);
	}

}
