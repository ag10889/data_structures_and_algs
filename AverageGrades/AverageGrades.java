package AverageGrades;
import java.util.Scanner;
/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 2
 * IDE Name: VS Code
 */

 /* TODO
  *  -[x] create public static to have a menu bar with selection choices
  * -[X] create choices read class size (some sort of int)
  * -[X] read class grades (maybe some sort of a array)
  * -[X] compute class average
  * -[X] exit
  */
public class AverageGrades {

    public static void main(String[] args) {
        
        int classSize = 0;
        int[] grades = null;
        
        while(true){
            System.out.println("Main Menu");
            System.out.println("1. Read class size");
            System.out.println("2. Read class grades");
            System.out.println("3. Compute class average");
            System.out.println("4. Exit Program");
            System.out.println("Enter option number:");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    // TODO: read a class size
                    System.out.println("Enter class size:");
                    classSize = scanner.nextInt();
                    grades = new int[classSize];
                    break;
                case 2:
                    // TODO: read class grades
                    System.out.println("Enter class grades:");
                    for (int i = 0; i < classSize; i++) {
                        grades[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    // TODO: compute class average
                    double average = findAverage(grades, classSize);
                    if (average != -1) {
                        System.out.println("Class average: " + average);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    break;
            }
        }
    }
    public static double findAverage(int[] grades, int classSize) {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades available to compute average.");
            return -1;  // Meaningful value indicating no grades present
            }
            double sum = grades[0];
            if (classSize == 1) {
                return sum; // Base case: only one grade
            } else {
                return sum + findAverage(java.util.Arrays.copyOfRange(grades, 1, grades.length), classSize - 1);
            }
        }

}
