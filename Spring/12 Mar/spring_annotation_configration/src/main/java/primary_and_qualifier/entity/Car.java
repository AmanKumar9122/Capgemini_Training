package primary_and_qualifier.entity;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
        public void start() {
            System.out.println("Car is starting...");
        }
}
