import java.util.Scanner;
/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 5
 * IDE Name: IntelliJ IDEA
 */

 //TODO 
 /*
  * printMenu
  * 1 - Enqueue element
  * 2 - dequeue element
  * 3 - get front element
  * 4 - get queue size
  * 5 - is empty queue
  * 6 - print queue
  * 7 - exit 
  */

  /* TODO 
   * create printMenu method
   * create main method
   * -[X] create option if statements
   * -[X] test data
   */

   public class TestQueue
{
    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Enqueue element");
        System.out.println("2. Dequeue element");
        System.out.println("3. Get front element");
        System.out.println("4. Get queue size");
        System.out.println("5. Is empty queue");
        System.out.println("6. Print queue");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }

    public static void main(String[] args){
        printMenu();
        Scanner s1 = new Scanner(System.in);
        Queue<Integer> myQueue = new Queue<Integer>();
    
        int option = s1.nextInt();
        while (option != 7) {
            if (option == 1) {
                System.out.println("Enter value to enqueue: ");
                int value = s1.nextInt();
                System.out.println("Queue before enqueue: " + myQueue.size() + " elements.");
                myQueue.enqueue(value);
                System.out.println("Queue after enqueue: " + myQueue.size() + " elements.");
                printMenu();
                option = s1.nextInt();
            }
            else if (option == 2) {
                System.out.println("Value to be dequeued: " + myQueue.front());
                myQueue.dequeue();
                printMenu();
                option = s1.nextInt();
            }
            else if (option == 3) {
                System.out.println("Front element is: " + myQueue.front());
                printMenu();
                option = s1.nextInt();
            }
            else if (option == 4) {
                System.out.println("Queue size is: " + myQueue.size() + " elements.");
                printMenu();
                option = s1.nextInt();
            }
            else if (option == 5) {
                if (myQueue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    System.out.println("Queue is not empty.");
                }
                printMenu();
                option = s1.nextInt();
            }
            else if (option == 6) {
                System.out.println("Queue to be printed: ");
                while (!myQueue.isEmpty()) {
                    System.out.print(myQueue.dequeue() + " ");
                }
                System.out.println();
                printMenu();
                option = s1.nextInt();
            }
            else {
                System.out.println("Invalid option. Please try again.");
                printMenu();
                option = s1.nextInt();
            }
        }
       
    }
}

   
