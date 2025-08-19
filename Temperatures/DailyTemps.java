package Temperatures;
/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 1
 * IDE Name: IntelliJ IDEA
 */

/*
 * TO DO 
 *  - [x] create constructors for dailyTemps, with/without parameters
 * -[x] create setTemp mutator method
 * -[x] ^ had to make a helper method, too complex 
 * - [x] freezing accessor method to return data
 * - [x] create warmest accessor method to return warmest data
 * -[x] print the temps
 */
import java.util.ArrayList;

public class DailyTemps {
    private ArrayList<String> dailyTemps = new ArrayList<>(7);
    /*
     * Monday = temps[0]
     * Tuesday = temps[1]
     * etc
     */
    public DailyTemps() {
        dailyTemps.add("Monday: 0.0");
        dailyTemps.add("Tuesday: 0.0");
        dailyTemps.add("Wednesday: 0.0");
        dailyTemps.add("Thursday: 0.0");
        dailyTemps.add("Friday: 0.0");
        dailyTemps.add("Saturday: 0.0");
        dailyTemps.add("Sunday: 0.0");
    }

    public DailyTemps(double[] inputTemps) {
        if (inputTemps.length != 7) { //throws issue with arrayList being wrong size
            throw new IllegalArgumentException("Array must contain exactly 7 temperatures for each day of the week.");
        } //then inputs values at respective indices
        dailyTemps.add("Monday: " + inputTemps[0]);
        dailyTemps.add("Tuesday: " + inputTemps[1]);
        dailyTemps.add("Wednesday: " + inputTemps[2]);
        dailyTemps.add("Thursday: " + inputTemps[3]);
        dailyTemps.add("Friday: " + inputTemps[4]);
        dailyTemps.add("Saturday: " + inputTemps[5]);
        dailyTemps.add("Sunday: " + inputTemps[6]);
    }

    public int helpWithDays(String dayOfTheWeek) { //helper method to convert days to indices, brute force approach, O(7) :(
        if (dayOfTheWeek.equalsIgnoreCase("Monday")) {
            return 0;
        } else if (dayOfTheWeek.equalsIgnoreCase("Tuesday")) {
            return 1;
        } else if (dayOfTheWeek.equalsIgnoreCase("Wednesday")) {
            return 2;
        } else if (dayOfTheWeek.equalsIgnoreCase("Thursday")) {
            return 3;
        } else if (dayOfTheWeek.equalsIgnoreCase("Friday")) {
            return 4;
        } else if (dayOfTheWeek.equalsIgnoreCase("Saturday")) {
            return 5;
        } else if (dayOfTheWeek.equalsIgnoreCase("Sunday")) {
            return 6;
        } else {
            throw new IllegalArgumentException("Invalid day of the week.");
        }
    }

    public void setTemp(String dayIndex, double temp) { //gets the day of the week, and updates the arrayList
        int index = helpWithDays(dayIndex);
        if (index < 0 || index >= dailyTemps.size()) {
            throw new IndexOutOfBoundsException("Day index must be between 0 and 6.");
        }
        String day = dailyTemps.get(index).split(": ")[0]; 
        dailyTemps.set(index, day + ": " + temp);
    }
    public String freezing(){
        int count = 0;
        for (String temp : dailyTemps) {
            double temperature = Double.parseDouble(temp.split(": ")[1]); //searches through the temp side 
            if (temperature < 32.0) {
                count++;
            }
        }
        return "Number of freezing days is " + count;
    }
    public String warmest(){
        String warmestDay = dailyTemps.get(0).split(": ")[0]; //sets monday to warmest day, just because
        double warmestTemp = Double.parseDouble(dailyTemps.get(0).split(": ")[1]); //sets mondays temp to warmest
        for (String temp : dailyTemps) {
            if (Double.parseDouble(temp.split(": ")[1]) > warmestTemp) {
                warmestTemp = Double.parseDouble(temp.split(": ")[1]);
                warmestDay = temp.split(": ")[0];
            }
        }
        return "The warmest day of the week is " + warmestDay;
    }
    public String printTemps(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dailyTemps.size(); i++) {
            sb.append(dailyTemps.get(i)).append("\n");
        }
        return sb.toString();
    }
}
