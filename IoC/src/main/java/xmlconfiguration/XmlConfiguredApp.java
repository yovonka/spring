package xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlconfiguration.coach.Coach;
import xmlconfiguration.coach.CricketCoach;

public class XmlConfiguredApp {

    public static void main(String[] args) {

        //1. load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlconfiguration/applicationContext.xml");

        //2. retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach betaCoach = context.getBean("myCoach", Coach.class);
        // check if they are the same
        boolean result = (theCoach == betaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach: " + betaCoach + "\n");

        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //3. call methods on the bean
        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());

        //4. call our new methods to get the literal values
        System.out.println(theCricketCoach.getEmailAddress());
        System.out.println(theCricketCoach.getTeam());

        context.close();
    }

}







