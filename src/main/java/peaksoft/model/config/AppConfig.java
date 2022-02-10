package peaksoft.model.config;

import org.springframework.context.annotation.*;
import peaksoft.model.Cat;
import peaksoft.model.HelloWorld;

@Configuration
@ComponentScan("peaksoft.model")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat car(){
        return new Cat();
    }
}
