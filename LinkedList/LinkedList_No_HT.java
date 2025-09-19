/*
  This class define a linked list that stores integer values.
  The class does NOT use Head and Tail pointer as the textbook class deos.
*/

/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 3
 * IDE Name: IntelliJ IDEA
 */

 /*TODO 
  *  -[X] addFirstNode method
  *  -[X] addAtIndex 
  *  -[X] removeFirstNode 
   * -[X] removeLastNode 
   * -[X] removeAtIndex 
   * -[X] countNodes 
   * -[X] printInReverseRecursive 
  */
public class LinkedList_No_HT
{
   public Node ListName;

   //constructor method to create a list object with a specifc name. 
   public LinkedList_No_HT()
   {
      ListName = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (ListName == null) 
         ListName = new Node(data); //one node list
      else 
      {
         Node temp = ListName;
         while (temp.next != null) 
         {
            temp = temp.next;
         }
         
         temp.next = new Node(data); //link new node as last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
          //complete this method
         Node n = new Node(data); //creates new node
         n.next = ListName; //old listname is now after new n node
         ListName = n;  //new node n is now the listname
   }
     
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
       //complete this method
      if (index < 0) { //Chekc for index validity 
         System.out.println("Invalid index, try again");
         return;
      }
      if (ListName == null) { //Chekcs for empty list
         System.out.println("List is empty.");
         return;
      }
      //Proceed after validity cheecks
      Node cur = ListName;
      for (int i = 0; i < index - 1; i++) {
         cur = cur.next; // stop at node before index
      }
      Node n = new Node(data);
      n.next = cur.next; //append n 
      cur.next = n;
      }
      
      
   //method #3: remove first node
   public void removeFirstNode()
   {
         //complete this method
         if (ListName == null) {
            System.out.println("List is empty.");
            return;
         }
         ListName = ListName.next;
   }
      
      
   //method #4: remove last node
   public void removeLastNode()
   {
         //complete this method
         if (ListName == null) {
            System.out.println("List is empty.");
            return;
         }
         Node cur = ListName;
         while (cur.next.next != null) {          
            cur = cur.next;
         }
         cur.next = null;              
   }
    
    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
         //complete this method
         if (ListName == null) {
         System.out.println("List is empty.");
            return;
         }
         if (index < 0) {
            System.out.println("Invalid index, try again");
            return;
         }
         int size = countNodes();
         if (index >= size) {
            System.out.println("Invalid index, try again.");
            return;
         }
         Node cur = ListName;
         for (int i = 0; i < index - 1; i++) {
            cur = cur.next; 
         }
         cur.next = (cur.next != null) ? cur.next.next : null;
   }
          
   //method #6: countNodes
   public int countNodes()
   {
      int listSize= 0;
      
      //complete this method to return the list size.
      Node cur = ListName;
      while (cur != null) {
         listSize++;
         cur = cur.next;
      }
        
      return listSize; 
   }

   
   //method #7: pritnInReverse (must be a Recursive method)
   public void printInReverseRecursive(Node L)
   {
      //complete this method as recursive method to print the list in reverse order.
      if (L == null) return;                 // base case
      printInReverseRecursive(L.next);       // recurse to the end
      System.out.print(L.data + "   ");     // print on unwind
   }   

   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = ListName;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   private class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}

