package Bridgelabz;

/**
 * Welcome
 */
public class StackandQueue {

    Node head;
    static int size = 0;
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Uc3 = enque elements in Queue.
    public void enqueElements(Object data){   // creating enque method in queue
        Node newNode = new Node(data);
        if(head == null){                          // check queue is empty or not
            head = newNode;
            return;
        }
        Node temp = head;                         // taking temporary variable temp
        while (temp.next != null){
            temp = temp.next;                     // traverse till end of queue
        }
        temp.next = newNode;
    }
    // Uc4 = deque elements from queue.
    public void dequeElements() {
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;              // it will deque first element in the queue.
    }
    // display the Queue elements.
    public void displayElements(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +" => ");  //display all elements in stack
            temp = temp.next;

        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        StackandQueue runner = new StackandQueue();
        runner.enqueElements(56);
        runner.enqueElements(30);
        runner.enqueElements(70);
        runner.dequeElements();
        runner.displayElements();
    }
}