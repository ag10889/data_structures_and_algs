/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 1
 * IDE Name: IntelliJ IDEA
 */
/*
 * -[x] initially asks for width, followed by height
 * --[x] outputs default and loaded constructor
 */
package Rectangle;
import java.util.Scanner;

public class TestRectangle extends Rectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double x = scanner.nextDouble();
        System.out.print("Enter height: ");
        double y = scanner.nextDouble();
        scanner.close();
        System.out.println(rect.printRectangle("DefaultRectangle"));
        Rectangle yourRectangle = new Rectangle(x, y);
        System.out.println(yourRectangle.printRectangle("YourRectangle"));
    }
}
