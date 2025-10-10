import java.util.Scanner;;
/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 5
 * IDE Name: IntelliJ IDEA
 */

/*TODO
 * -[X] create printMenu method
 * -[X][ creat static void main method ]
 * -[X] prompt user for option from printMenu method
 * -[X] promopt user for data 
 * -[] print contents before and after being sorted 
 * -[] do radiz sort with one set of  Queue buckets
 * -[X] extractDigit method
 * -[X] countDigits method
 */

 /*
  * 1 - read array size
  2 - read array values 
  3 - run radix sort and print outputs 
  4 - exit program
  */

public class RadixSort {
    public static void extractDigit(int array[], int value, Queue<Integer>[] buckets) {
        for (int i = 0; i < array.length; i++) {
            int digit = (array[i] / (int)Math.pow(10, value)) % 10; //extracts rightmost digit in value
            buckets[digit].enqueue(array[i]); //enqueues rightmost digit into buckets queue from array value i
        }
        //ddequeue process 
        int index = 0; 
        for (int i = 0; i < buckets.length; i++) {
            while (!buckets[i].isEmpty()) {
                array[index++] = buckets[i].dequeue();
            }
        }
        
    }
    public static int countDigits(int array[]) {
         int max = array[0];
         for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
         }
         int digits = 0;
         for (int val = max; val > 0; val /= 10) {
            digits++;
         }
         return digits;
    }

    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1 - Read array size");
        System.out.println("2 - Read array values");
        System.out.println("3 - Run radix sort and print outputs");
        System.out.println("4 - Exit program");
    }
    public static void main(String[] args) {
        printMenu();
        Scanner s1 = new Scanner(System.in);
        int option = s1.nextInt();
        int[] array = null;
        while (option != 4) {
            if (option == 1) {
                System.out.println("Enter array size: ");
                int size = s1.nextInt();
                array = new int[size];
                printMenu();
                option = s1.nextInt();
            }
            if (option == 2) {
                System.out.println("Enter array values: ");
                for (int i = 0; i < array.length; i++) {
                    array[i] = s1.nextInt();
                }
                printMenu();
                option = s1.nextInt();
            }
            if (option == 3) {
                System.out.println("Array before sorting: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                int digits = countDigits(array);
                Queue<Integer>[] buckets = new Queue[10];
                for (int i = 0; i < buckets.length; i++) {
                    buckets[i] = new Queue<Integer>();
                }
                for (int i = 0; i < digits; i++) {
                    extractDigit(array, i, buckets);
                }
                System.out.println("Array after sorting: ");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
                printMenu();
                option = s1.nextInt();
            }
            else {
                System.out.println("Invalid option. Plrease try again.");
                printMenu();
                option = s1.nextInt();
            }     
        }       
    }
}
