package javaannotation;

import objects.Coach;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {


    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


}










