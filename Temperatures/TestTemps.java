package Temperatures;

/*
 * TO DO
 * -[x] make some data
 * -[x] instantiate a default constructor
 * -[x] instantiate a loaded constructor
 * -[] test setTemp, freezing, warmest, & printTemps on both default & loaded
 */
public class TestTemps extends DailyTemps {

    public static void main(String[] args) {
        double[] testData = {30.0, 79.2, 99.9, 63.5, 57.8, 29.7, 37.9};
        DailyTemps dailyTemps = new DailyTemps();
        DailyTemps dailyTempsTwo = new DailyTemps(testData);


    }
}