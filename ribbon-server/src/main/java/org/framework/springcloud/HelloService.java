package org.framework.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: lixp
 * Date: 2019/8/8
 * Time: 17:55
 * Mail: lixp0915@163.com
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,
                String.class);
    }
}
