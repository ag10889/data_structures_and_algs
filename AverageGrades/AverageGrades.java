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
  * -[] implement propper error handling for exception in thread
  * -[X] exit
  */
public class AverageGrades {

    public static void main(String[] args) {
        int classSize = 0;
        int[] grades = null;
        boolean haveGrades = false;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printMenu();
                int option = readMenuOption(scanner, "Enter option number: ");

                /*
                 * Holy error handling ahead 
                 * every case has multiple error checks, from sizes, nulls, inputs, and resource usage 
                 * and resource closure
                 * 
                 */
                switch (option) {
                    case 1:
                        // Read a positive class size
                        classSize = readPositiveInt(scanner, "Enter class size: ");
                        grades = new int[classSize];
                        haveGrades = false; // reset since size changed
                        break;
                    case 2:
                        if (classSize <= 0 || grades == null) {
                            System.out.println("Please set the class size first (option 1).");
                            break;
                        }
                        System.out.println("Enter class grades:");
                        for (int i = 0; i < classSize; i++) {
                            grades[i] = readIntInRange(scanner, 0, 100);
                        }
                        haveGrades = true;
                        break;
                    case 3:
                        if (classSize <= 0 || (grades == null && haveGrades == false)) {
                            System.out.println("Please see the previous options. ");
                        }
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

    private static int readMenuOption(Scanner sc, String prompt) { //takes the menu, and reads the imput option (had error handling expections) 
        //takes the menu input, and validates it (1-4) but also checking for non ints and then discarding those attempts
        System.out.print(prompt);
        while (!sc.hasNextInt()) { //s/o java.util.scanner 
            System.out.println("Not a number. Try 1–4.");
            sc.next(); // discards the invalid response
            System.out.print("Enter option number: ");
        }
        return sc.nextInt(); //returns the checked value :)
    }

    private static int readPositiveInt(Scanner sc, String prompt) { 
        System.out.print(prompt); 
        while (true) {
            int val = sc.nextInt(); //until reponse is valid
            if (val >= 1) return val; 
            System.out.print("Enter a class size >= 1: ");
        }
    }

    private static int readIntInRange(Scanner sc, int min, int max) { //handled problems with negative grades
        while (true) {
            int val = sc.nextInt();
            if (val >= min && val <= max) return val; //checks that its positive and within a normal grade range (0-100)
            System.out.printf("Please enter a value between %d and %d: ", min, max); //polietly asks for a valid input between min and max
        }
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
