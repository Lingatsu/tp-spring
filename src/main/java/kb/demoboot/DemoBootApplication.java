package kb.demoboot;

import kb.demoboot.bo.Livre;
import kb.demoboot.controller.HelloController;
import kb.demoboot.repository.LivreRepository;
import kb.demoboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBootApplication implements CommandLineRunner {

    @Autowired
    private HelloController controller;
    @Autowired
    private HelloService service;

    private LivreRepository dao;

    @Autowired
    public DemoBootApplication(HelloController controller, HelloService service, LivreRepository dao) {
        this.controller = controller;
        this.service = service;
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(controller.sayHello());
//        System.out.println(service.greeting());
        Livre lACreer = new Livre("EPSI Montpellier","Jacques");
        dao.save(lACreer);

        dao.findAll().forEach(System.out::println);
    }

}
