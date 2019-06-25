package javaannotation;

import javaannotation.coach.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationApp {

    public static void main(String[] args) {

        // read spring config file -  no need XML
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach methods ... has the props values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // close the context
        context.close();

    }
}
