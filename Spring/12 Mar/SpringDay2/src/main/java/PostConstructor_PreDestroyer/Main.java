package PostConstructor_PreDestroyer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("post_constructor&pre_destroyer.xml");
        Vehicle v1 = (Vehicle) context.getBean("v_id");
        ((AbstractApplicationContext) context).close();
    }
}
