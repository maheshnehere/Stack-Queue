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
    public void pushElementInStack(Object data){   // creating push method in stack
        Node newNode = new Node(data);
        if(head == null){                          // check stack is empty or not
            head = newNode;
            return;
        }
        Node temp = head;                         // taking temporary variable temp
        while (temp.next != null){
            temp = temp.next;                     // traverse till end of stack
        }
        temp.next = newNode;
    }
    public void showElements(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +" => ");  //show all elements in stack
            temp = temp.next;

        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        StackandQueue runner = new StackandQueue();
        runner.pushElementInStack(85);
        runner.pushElementInStack(24);
        runner.pushElementInStack(16);
        runner.showElements();
    }
}