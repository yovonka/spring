package start;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach(); //hardCoded

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
