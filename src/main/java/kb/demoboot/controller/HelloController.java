package kb.demoboot.controller;

import kb.demoboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private HelloService service;

    //Injection avec la deuxieme méthode IoC
    @Autowired
    public HelloController(HelloService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.greeting();
    }
}
