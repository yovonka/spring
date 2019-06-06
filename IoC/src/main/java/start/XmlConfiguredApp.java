package start;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import start.coach.Coach;

public class XmlConfiguredApp {

    public static void main(String[] args) {

        //1. load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("start/applicationContext.xml");

        //2. retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //3. call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }

}







