package xmlconfiguration.coach;

import objects.Coach;
import objects.FortuneService;

import java.util.Objects;

public class TrackCoach implements Coach {

    private final FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = Objects.requireNonNull(fortuneService);
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside init method");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside destroy method");
    }
    //for "prototype" scoped beans, Spring does not call the destroy method
}










