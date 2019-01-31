package github.cotra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String index() {
        return "service-hello is running";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello " + "i am from port:" + port;
    }
}
