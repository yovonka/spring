package start;

public class HardcodedApp {

    public static void main(String[] args) {

        // create the object
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();
        //TODO
        //hardCoded - need Object Factory to create and menage object IoC
        //after that inject object dependencies

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
