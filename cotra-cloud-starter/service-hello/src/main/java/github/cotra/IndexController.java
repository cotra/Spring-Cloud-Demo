package github.cotra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public String home() {
        return "hi " + "i am from port:" + port;
    }
}
