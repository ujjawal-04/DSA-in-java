package Queue;


import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear =  null;
        this.length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void print() {
        if(isEmpty()) {
            return;
        }
        ListNode current = front;
        while(current!= null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if(isEmpty()) {
            front = temp;
        } else {
            rear.next= temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null) {
           rear = null;
        }
        length--;
        return result;
    }

    public int first() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public int last() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);

        q.print();
         
        System.out.println(q.first());
        System.out.println(q.last());

        q.dequeue();
        q.print();
        System.out.println(q.first());
        System.out.println(q.last());

    }
}
