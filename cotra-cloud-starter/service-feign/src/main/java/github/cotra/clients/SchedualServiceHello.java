package github.cotra.clients;

import github.cotra.clients.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hello", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHello {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne();
}

