package xmlconfiguration.coach;

import xmlconfiguration.fortune.FortuneService;

import java.util.Objects;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private final FortuneService fortuneService;

    // define a constructor for DI
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = Objects.requireNonNull(fortuneService);
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}








