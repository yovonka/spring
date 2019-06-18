package javaannotation;

import javaannotation.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaAnnotationApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("javaannotation/applicationContext.xml");

        // get the bean from spring container
        CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
