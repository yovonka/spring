package start.coach;

import start.fortune.FortuneService;

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
}










