package org.framework.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by po on 2019/8/8.
 */
@RestController
public class HelloFeignController {

    @Autowired
    HelloFeignService helloFeignService;

    @RequestMapping("/hi")
    public String sayHiToFeign(@RequestParam  String name){
        return helloFeignService.helloFeignServer(name);
    }
}
