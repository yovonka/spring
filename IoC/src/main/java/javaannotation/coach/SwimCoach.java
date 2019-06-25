package javaannotation.coach;

import objects.Coach;
import objects.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    @Value("${test.emailAddress}")
    private String email;
    @Value("${test.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
