package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.model.Cat;
import peaksoft.model.HelloWorld;
import peaksoft.model.config.AppConfig;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
        System.out.println(bean == helloWorld);
        System.out.println();

        Cat cat = applicationContext.getBean("cat",Cat.class);
        Cat cat1 = applicationContext.getBean("cat",Cat.class);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat == cat1);


    }
}
