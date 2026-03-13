package annotation_configuration.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:di.property")
@Configuration
@ComponentScan(basePackages = {"annotation_configuration", "pre_post_usingannotation"})
public class AppConfig {

}
