package Temperatures;

/*
 * TO DO
 * -[x] make some data
 * -[x] instantiate a default constructor
 * -[x] instantiate a loaded constructor
 * -[x] test setTemp, freezing, warmest, & printTemps on both default & loaded
 */
public class TestTemps extends DailyTemps {

    public static void main(String[] args) {
        double[] testData = {30.0, 79.2, 99.9, 63.5, 57.8, 29.7, 37.9};
        DailyTemps dailyTemps = new DailyTemps();
        DailyTemps dailyTempsTwo = new DailyTemps(testData);

        
        dailyTemps.setTemp("Monday", 42.0);
        dailyTempsTwo.setTemp("Tuesday", 73.5);

        
        System.out.println(dailyTemps.freezing());
        System.out.println(dailyTempsTwo.freezing());

        
        System.out.println(dailyTemps.warmest());
        System.out.println(dailyTempsTwo.warmest());

        
        System.out.println(dailyTemps.printTemps());
        System.out.println(dailyTempsTwo.printTemps());
    }
}