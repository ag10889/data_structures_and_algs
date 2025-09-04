package Vowels;
import java.util.Scanner;

/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 2
 * IDE Name: IntelliJ IDEA
 */

 /*To Do
  * -[X] make a input method with a menu
  * -[X] menu has three options; read input string, compute # of vowels, and exit program
  * -[] make recursive method countVowels
  */
public class Vowels {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (true) {
            printMenu();

            int option = scan.nextInt();
            scan.nextLine();  // consume the newline character

            if (option == 1) {
                System.out.println("Enter a string:");
                input = scan.nextLine(); 
            } else if (option == 2) { 
                System.out.println("Number of vowels: " + countVowels(input));
            } else if (option == 3) {
                System.out.println("Exiting the program.");
                scan.close();
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
    private static void printMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Read input string");
        System.out.println("2. Compute number of vowels");
        System.out.println("3. Exit program");
        System.out.println("Enter option number");
    }

    public static int countVowels(String s) {
        if (s == null || s.length() == 0) {
            return 0; // base case
        }
        char first = Character.toLowerCase(s.charAt(0));
        int count = (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') ? 1 : 0; //checks, ignores commas
        return count + countVowels(s.substring(1)); 
    }
}
