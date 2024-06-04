package kb.demoboot.controller;

import kb.demoboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    private HelloService helloService;

    @Autowired
    public HomeController(HelloService helloService) {
        this.helloService = helloService;
    }
    public String messageAccueil(){
        return helloService.greeting();
    }
}

