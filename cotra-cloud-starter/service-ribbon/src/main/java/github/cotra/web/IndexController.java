package github.cotra.web;

import github.cotra.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/")
    public String index() {
        return helloService.hiService();
    }

    @RequestMapping(value = "/hello")
    public String test() {
        return helloService.hiService();
    }
}
