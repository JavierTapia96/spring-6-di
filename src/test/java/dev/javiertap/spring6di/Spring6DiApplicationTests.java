package dev.javiertap.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import dev.javiertap.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testAutowiredController() {
        System.out.println("In testAutowiredController method");
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFromContext() {
        MyController controller = applicationContext.getBean(MyController.class);
        System.out.println("In testGetControllerFromContext method");
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
