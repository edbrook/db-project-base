package uk.co.edbrook.scratch.app;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.edbrook.scratch.hello.Hello;
import uk.co.edbrook.scratch.hello.HelloService;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public HellosResponse hello() {
        List<Hello> hellos = helloService.getHello();
        return new HellosResponse(hellos);
    }
}
