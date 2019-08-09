package org.framework.springcloud;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: lixp
 * Date: 2019/8/9
 * Time: 16:58
 * Mail: lixp0915@163.com
 */
@Service
public class HelloFeignServiceFallback implements HelloFeignService {

    @Override
    public String helloFeignServer(String name) {
        return "hello: " + name + "~sorry, error occurred";
    }
}
