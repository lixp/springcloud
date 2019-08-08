package org.framework.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by po on 2019/8/8.
 */
@Service
@FeignClient(value = "eureka-client")
public interface HelloFeignService {

    @RequestMapping("/hi")
    String helloFeignServer(@RequestParam(value = "name")  String name);

}
