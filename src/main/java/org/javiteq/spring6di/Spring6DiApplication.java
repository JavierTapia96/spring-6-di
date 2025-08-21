package org.javiteq.spring6di;

import org.javiteq.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("Main Method");
        System.out.println(controller.sayHello());
    }
}
