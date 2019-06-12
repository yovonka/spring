package javaannotation.coach;

import objects.Coach;
import objects.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) { // it could be any method not necessary setter
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
