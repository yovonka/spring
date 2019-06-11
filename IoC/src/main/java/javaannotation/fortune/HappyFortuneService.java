package javaannotation.fortune;

import objects.FortuneService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    @PostConstruct // add an init method
    public void doMyStartupStuff() {
        System.out.println("HappyFortuneService: inside init method");
    }

    @PreDestroy // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("HappyFortuneService: inside destroy method");
    }
}
