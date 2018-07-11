package hello;

import org.springframework.stereotype.Component;

@Component(value = "springHello")
public class SpringHello implements HelloWorld {

    public void sayHello() {
        System.out.println("Spring say Hello!");
    }

    public SpringHello springHello() {
        return new SpringHello();
    }
}
