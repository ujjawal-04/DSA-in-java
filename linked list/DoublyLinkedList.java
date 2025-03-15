import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
             this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int length() {
        return length;
     }

public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if(isEmpty()) {
        head = newNode;
    } else {
        tail.next = newNode;
    }
    newNode.prev = tail;
    tail = newNode;
    length++;
}

public void displayForward() {
   if(head == null) {
    return;
   }
   ListNode temp = head;
   while(temp!= null) {
    System.out.print(temp.data + "->");
    temp = temp.next;
   }
   System.out.println("null");
}

public void displayBackward() {
    if(tail == null) {
     return;
    }
    ListNode temp = tail;
    while(temp!= null) {
     System.out.print(temp.data + "->");
     temp = temp.prev;
    }
    System.out.println("null");
 }

 public void insertBeginning(int value) {
    ListNode newNode = new ListNode(value);
    if(isEmpty()) {
        tail = newNode;
    } else {
        head.prev = newNode;
    }
    newNode.next = head;
    head = newNode;
 }

 public void insertEnd(int value) {
    ListNode newNode = new ListNode(value);
    if(isEmpty()) {
        head = newNode;
    } else {
        tail.next = newNode;
        newNode.prev= tail;
    }
    tail = newNode;
 }


 public ListNode deleteBeginning() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    ListNode temp = head;
    if (head == tail) { 
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    temp.next = null;
    length--;
    return temp;  
}

public ListNode deleteEnd() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    ListNode temp = tail;
    if (head == tail) { 
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    temp.next = null;
    length--;
    return temp;  
}


public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insertLast(1);
    dll.insertLast(10);
    dll.insertLast(15);
    dll.insertLast(25);

    dll.displayForward();
    dll.displayBackward();

    dll.insertBeginning(20);
    dll.displayForward();

    dll.insertEnd(22);
    dll.displayForward();

    dll.deleteBeginning();
    dll.displayForward();

    dll.deleteEnd();
    dll.displayForward();
}
}
