/*
 * Name : Alex George
 * Class: CS 3305/SectionW04
 * Term: Fall 2025
 * Instructor: Prof. Wang
 * Assignment: 5
 * IDE Name: IntelliJ IDEA
 */

/*TODO
 *  -[X] Create Node class similar to LinkedList_no_HT
 *  -[] Create enqueue method to add node at end of queue
 *  -[X] create dequeue method to remove node from front of queue
 * -[X] create front() method to retrieve queue first element
 * -[X] create size() method to return size of queue 
 * -[X] create isEmpty queue method to check if queue is empty 
 * -
 */
public class Queue<E> {

    private class Node {
        private E data;
        private Node next;

        public Node(E item) {
            data = item;
            next = null;
        }
    }
    public Node queueName;

    
    public Queue(){
        queueName = null;
        
    }
    public void enqueue(E e){
        if (queueName == null) {
            queueName = new Node(e);
        }
        else {
            Node temp = queueName;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
        }

    }

    public E dequeue(){ //removes from front of queue
        if (queueName == null) {
            throw new IllegalStateException("Queue is empty");
        }
        E data = queueName.data;
        queueName = queueName.next;
        return data;
    }

    public E front(){ //returns value at front of queue, does not remove. might be useful for dequeue
        return queueName.data;
    }

    public int size(){ //returns size of queue
        int size = 0;
        Node current = queueName;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    public boolean isEmpty(){
        return queueName == null;

    }
}
