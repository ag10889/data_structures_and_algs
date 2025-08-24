package Temperatures;
import java.util.Scanner;
/*
 * TO DO
 * -[x] make some data
 * -[x] instantiate a default constructor
 * -[x] instantiate a loaded constructor
 * -[x] test setTemp, freezing, warmest, & printTemps on both default & loaded
 * -[] add a input string for user input
 */
public class TestTemps extends DailyTemps {

    public static void main(String[] args) {
        double[] testData = {30.0, 79.2, 99.9, 63.5, 57.8, 29.7, 37.9};
        double[] userTestData = new double[7];
        Scanner scan = new Scanner(System.in);
        DailyTemps dailyTemps = new DailyTemps();
        DailyTemps dailyTempsTwo = new DailyTemps(testData);

        for (int i = 0; i < userTestData.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            userTestData[i] = scan.nextDouble();
        }
        scan.close();
        DailyTemps dailyTempsThree = new DailyTemps(userTestData);
        dailyTemps.setTemp("Monday", 42.0);
        dailyTempsTwo.setTemp("Tuesday", 73.5);
        dailyTempsThree.setTemp("Sunday", 85.0);



        System.out.println(dailyTemps.warmest());
        System.out.println(dailyTempsTwo.warmest());
        System.out.println(dailyTempsThree.warmest());

        System.out.println(dailyTemps.freezing());
        System.out.println(dailyTempsTwo.freezing());
        System.out.println(dailyTempsThree.freezing());

        System.out.println(dailyTemps.printTemps());
        System.out.println(dailyTempsTwo.printTemps());
        System.out.println(dailyTempsThree.printTemps());
    }
}