package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloProgram {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        HelloWorldService helloService = context.getBean("helloWorldService", HelloWorldService.class);
//        HelloWorld hw = helloService.getHelloWorld();
//
//        hw.sayHello();

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldService.class);
        HelloWorldService helloService = context.getBean("helloWorldService", HelloWorldService.class);
        HelloWorld hw = helloService.getHelloWorld();

        hw.sayHello();
    }
}
