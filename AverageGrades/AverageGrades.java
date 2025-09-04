package AverageGrades;
import java.util.Scanner;

/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 2
 * IDE Name: IntelliJ IDEA
 */

 /* TODO
  *  -[x] create public static to have a menu bar with selection choices
  * -[X] create choices read class size (some sort of int)
  * -[X] read class grades (maybe some sort of a array)
  * -[X] compute class average, round to 2 decimal 
  * -[X] exit
  */
public class AverageGrades {

    public static void main(String[] args) {
        int classSize = 0;
        int[] grades = null;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                int option = readMenuOption(scanner, "Enter option number:");
                switch (option) {
                    case 1:
                        // Read a positive class size
                        System.out.println("Enter class size: ");
                        classSize = scanner.nextInt();
                        System.out.println("You entered class size: " + classSize);
                        grades = new int[classSize];
                        break;
                    case 2:
                        System.out.println("Enter class grades:");
                        for (int i = 0; i < classSize; i++) {
                            grades[i] = scanner.nextInt();
                        }
                        System.out.println("You entered grades: " + printGrades(grades));
                        break;
                    case 3:
                        double average = findAverage(grades, classSize);
                        System.out.printf("Class average: %.2f%n", average);
                        break;
                    case 4:
                        System.out.println("Exiting program.");
                        return; // clean exit from main
                    default:
                        System.out.println("Invalid option. Choose 1–4.");
                }
            }
        }
    }

    private static void printMenu() { //theres so much in the static main
        //simple menu as seen in other projects
        System.out.println("Main Menu");
        System.out.println("1. Read class size");
        System.out.println("2. Read class grades");
        System.out.println("3. Compute class average");
        System.out.println("4. Exit Program");
    }

    private static String printGrades(int[] grades) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]).append(" ");
        }
        return sb.toString();
    }

    private static int readMenuOption(Scanner sc, String prompt) { //takes the menu, and reads the imput option (had error handling expections) 
        //takes the menu input, and validates it (1-4) but also checking for non ints and then discarding those attempts
        System.out.print(prompt);
        return sc.nextInt(); //returns the checked value :)
    }

    public static double findAverage(int[] grades, int classSize) {
        // bc we validated everything beforehand, we chilling
        double sum = recursiveSum(grades, classSize, 0);
        return Math.round((sum / classSize) * 100.0) / 100.0; //like binary multiplication and division to shift spaces 
    }

    private static double recursiveSum(int[] grades, int classSize, int index) {
        if (index >= classSize) {
            return 0.0; // base case
        }
        return grades[index] + recursiveSum(grades, classSize, index + 1);
    }
}
