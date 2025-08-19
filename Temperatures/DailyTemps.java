package Temperatures;
/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 1
 * IDE Name: IntelliJ IDEA
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DailyTemps {
    private ArrayList<String> dailyTemps = new ArrayList<>(7);
    /*
     * Monday = temps[0]
     * Tuesday = temps[1]
     * etc
     */
    public DailyTemps() {
        // Initialize the daily temperatures with default values
        dailyTemps.add("Monday: 0.0");
        dailyTemps.add("Tuesday: 0.0");
        dailyTemps.add("Wednesday: 0.0");
        dailyTemps.add("Thursday: 0.0");
        dailyTemps.add("Friday: 0.0");
        dailyTemps.add("Saturday: 0.0");
        dailyTemps.add("Sunday: 0.0");
    }

    public DailyTemps(double[] inputTemps) {
        if (inputTemps.length != 7) {
            throw new IllegalArgumentException("Array must contain exactly 7 temperatures for each day of the week.");
        }
        dailyTemps.add("Monday: " + inputTemps[0]);
        dailyTemps.add("Tuesday: " + inputTemps[1]);
        dailyTemps.add("Wednesday: " + inputTemps[2]);
        dailyTemps.add("Thursday: " + inputTemps[3]);
        dailyTemps.add("Friday: " + inputTemps[4]);
        dailyTemps.add("Saturday: " + inputTemps[5]);
        dailyTemps.add("Sunday: " + inputTemps[6]);
    }

    public void setTemp(int dayIndex, double temp) {
        if (dayIndex < 0 || dayIndex >= dailyTemps.size()) {
            throw new IndexOutOfBoundsException("Day index must be between 0 and 6.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature for " + dailyTemps.get(dayIndex).split(":")[0] + ": ");
        double newTemp = scanner.nextDouble();
        String day = dailyTemps.get(dayIndex).split(":")[0];
        dailyTemps.set(dayIndex, day + ": " + newTemp);
        scanner.close();
    }
    public String freezing(){
        int count = 0;
        for (String temp : dailyTemps) {
            double temperature = Double.parseDouble(temp.split(": ")[1]);
            if (temperature < 32.0) {
                count++;
            }
        }
        return "Number of freezing days is " + count;
    }
    public String warmest(){
        String warmestDay = dailyTemps.get(0).split(": ")[0];
        double warmestTemp = Double.parseDouble(dailyTemps.get(0).split(": ")[1]);
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
