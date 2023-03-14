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
    // Uc1 = push elements in stack.
    public void pushStack(Object data){   // creating push method in stack
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
    //uc2 = pop elements from the stack.
    public void popStack(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        if(head.next == null){                  // if stack  has only one element then this block will execute.
            head = null;
            return;
        }
        Node lasttemp = head.next;
        Node secondLastTemp = head;
        while (lasttemp.next != null) {
            lasttemp = lasttemp.next;           // traverse till top of the stack
            secondLastTemp = secondLastTemp.next;
        }
        secondLastTemp.next = null;            // delete the element
    }
    // display the stack elements.
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
        StackAndQueue runner = new StackAndQueue();
        runner.pushStack(85);
        runner.pushStack(24);
        runner.pushStack(16);
        runner.popStack();
        runner.popStack();
        runner.popStack();
        runner.displayElements();
    }
}