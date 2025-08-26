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
  * -[] create choices read class size (some sort of an array)
  * -[] read class grades (maybe some sort of a array)
  * -[] compute class average
  * -[] exit
  */
public class AverageGrades {
    public static void main(String[] args) {
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
                    // TODO: Implement read class size
                    break;
                case 2:
                    // TODO: Implement read class grades
                    break;
                case 3:
                    // TODO: Implement compute class average
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    scanner.close();
                    break;
            }
        }
    }
    
}
