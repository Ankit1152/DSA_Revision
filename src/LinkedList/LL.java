package LinkedList;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    } 

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode; 
    }

    // add last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        // To traverse in Linked list
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // deleteFirst
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deleteLast()
    public void deleteLast() {
        if(head == null) {
            System.out.println("The List is empty");
            return;
        }
        
        size--;
        // delete the single node 
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null

        while(lastNode.next != null) {   // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }  
        Node prevNode = null;
        Node currNode = head;

        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update the prevNode, currNode, nextNode
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addlast("list");
        list.addFirst("This");
        list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());
        // list.addlast("this");
        // System.out.println(list.getSize());

        list.reverseIterate();
        list.printList();
    }
}
