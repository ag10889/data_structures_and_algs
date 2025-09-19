import java.util.Scanner;
// Add your header here

/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 3
 * IDE Name: IntelliJ IDEA
 */

 //TODO 
 /*
  * printMenu
  * 1 add first node
  * 2 add last node 
  * 3 add at index 
  * remove first node 
  * remove last node 
  * remove at index 
  * print list size
  * print list forward
  * print list in reverse
  * exit
  *option #
  */


public class myTest_No_HT
{

   public static void printMenu() {
      System.out.println("\nMain Menu:");
      System.out.println("1. Add first node");
      System.out.println("2. Add last node");
      System.out.println("3. Add at index");
      System.out.println("4. Remove first node");
      System.out.println("5. Remove last node");
      System.out.println("6. Remove at index");
      System.out.println("7. Print list size");
      System.out.println("8. Print list forward");
      System.out.println("9. Print list in reverse");
      System.out.println("10. Exit");
      System.out.print("Choose an option: ");
   }
   
   public static void main (String[] args)
   {
      printMenu();
      Scanner scanner = new Scanner(System.in);
      LinkedList_No_HT myList = new LinkedList_No_HT(); //create a list object
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addLastNode(i*10);
      } 
      int option = scanner.nextInt();
      while (option != 10) {
         if (option == 1){
            System.out.println("Enter value to add as first node: ");
            int value = scanner.nextInt();
            System.out.println("Adding value " + value + " as first node." );
            System.out.print("List content before adding " + value + " is: ");
            myList.printList();
            System.out.println();
            myList.addFirstNode(value);
            System.out.print("List content after adding " + value + " is: ");
            myList.printList();
            System.out.println();   
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 2){
            System.out.println("Enter value to add as last node: ");
            int value = scanner.nextInt();
            System.out.println("Adding value " + value + " as last node." );
            System.out.print("List content before adding " + value + " is: ");
            myList.printList();
            System.out.println();
            myList.addLastNode(value);
            System.out.print("List content after adding " + value + " is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 3){
            System.out.println("Enter index to add node at: ");
            int index = scanner.nextInt();
            System.out.println("Enter value to add at index " + index + ": ");
            int value = scanner.nextInt();
            System.out.println("Adding value " + value + " at index " + index );
            System.out.print("List content before adding " + value + " is: ");
            myList.printList();
            System.out.println();
            myList.addAtIndex(index, value);
            System.out.print("List content after adding " + value + " is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 4){
            System.out.println("Removing first node." );
            System.out.print("List content before removing first node is: ");
            myList.printList();
            System.out.println();
            myList.removeFirstNode();
            System.out.print("List content after removing first node is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 5){
            System.out.println("Removing last node." );
            System.out.print("List content before removing last node is: ");
            myList.printList();
            System.out.println();
            myList.removeLastNode();
            System.out.print("List content after removing last node is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 6){
            System.out.println("Enter index to remove node at: ");
            int index = scanner.nextInt();
            System.out.println("Removing node at index " + index );
            System.out.print("List content before removing node at index " + index + " is: ");
            myList.printList();
            System.out.println();
            myList.removeAtIndex(index);
            System.out.print("List content after removing node at index " + index + " is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 7){
            int size = myList.countNodes();
            System.out.println("List size is: " + size);
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 8){
            System.out.print("List content printed forward is: ");
            myList.printList();
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else if (option == 9){
            System.out.print("List content printed in reverse is: ");
            myList.printInReverseRecursive(myList.ListName);
            System.out.println();
            printMenu();
            option = scanner.nextInt();
         }
         else {
            System.out.println("Invalid option, try again.");
            option = 10; 
         }


      //print out the list content
      /*System.out.print("\nMy test list values are:  ");
      myList.printList();
      System.out.println();    */
   } 
}
}
    
