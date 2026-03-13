package pre_post_usingannotation.entity;

import annotation_configuration.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle object created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Vehicle object initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Vehicle object destroyed");
    }

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle);
        context.close();
    }
}
