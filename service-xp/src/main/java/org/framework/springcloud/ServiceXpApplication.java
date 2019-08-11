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
public class ServiceXpApplication {

	private static Logger log = LoggerFactory.getLogger(ServiceXpApplication.class);

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String helloHome() {
		log.info("calling tracing service-xp hi ");
		return restTemplate.getForObject("http://localhost:8988/jiubo", String.class);
	}

	@RequestMapping("/info")
	public String info() {
		log.info("calling tracing service-xp info");
		return "hi, i'm service xp";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceXpApplication.class, args);
	}

}
