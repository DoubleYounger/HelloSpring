package hello;

import org.springframework.stereotype.Component;

@Component(value = "strutsHello")
public class StrutsHello implements HelloWorld {
    public void sayHello() {
        System.out.println("Struts say Hello!");
    }

    public StrutsHello strutsHello() {
        return new StrutsHello();
    }
}
