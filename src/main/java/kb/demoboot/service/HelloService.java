package kb.demoboot.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HelloService {

    public String greeting() {
        return "Hello World hash-code = " + this.hashCode();
//        return "Hello World hash-code = " + this.toString();
    }

    @PostConstruct
    public void init(){
        System.out.println("Ici on passe dans l'initialisation d'un objet service");
    }

}
