package javaannotation;

import javaannotation.coach.SwimCoach;
import javaannotation.fortune.SadFortuneService;
import objects.Coach;
import objects.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("javaannotation")
@PropertySource("classpath:properties/sport.properties")
public class AppConfig {

    @Bean // define bean for our sad fortune service
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean // define bean for our swim coach AND inject dependency
    public Coach swimCoach() {
        SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
        return mySwimCoach;
    }
}
