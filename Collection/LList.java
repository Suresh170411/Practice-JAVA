package Collection;

import java.util.LinkedList;

public class LList {

    Node head;
    private int size;

    LList() {
        size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // FIRST ADD linkdedList -------------------->
    public void addFirst(String data){
        
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // ADD LAST linkedList ---------------------->
    public void addLast(String data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

   public static void main(String[] args) {
        LList list = new LList();
        list.addFirst("a");
        list.addFirst("good");
   }
   
}
