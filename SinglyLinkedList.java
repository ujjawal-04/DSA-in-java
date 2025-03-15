public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
    }

    public void display() {
        display(head);
    }

    // Method to display the elements of the linked list
    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to find the length of the linked list
    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertStart(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the linked list
    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to insert a node at a specific position in the linked list
    public void insertSpecific(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position == 1) { 
            newNode.next = head;
            head = newNode;
            return;
        } 
        ListNode previous = head;
        int count = 1;
        while (count < position - 1 && previous.next != null) { 
            previous = previous.next;
            count++;
        }
        newNode.next = previous.next;
        previous.next = newNode;
    }

    // Method to delete the first node in the linked list
    public void deleteFirst() {
        if (head == null) return; 
        head = head.next; 
    }

    // Method to delete the last node in the linked list
    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) { 
            previous = current;
            current = current.next;
        }
        previous.next = null; 
    }

    // Method to delete a node at a specific position
    public void deleteSpecific(int position) {
        if (position == 1 && head != null) { 
            head = head.next;
            return;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position - 1 && previous.next != null) { 
            previous = previous.next;
            count++;
        }
        if (previous.next != null) {
            previous.next = previous.next.next; 
        }
    }

    // Method to search a key in a linked list
    public boolean find(ListNode head, int key) {
        ListNode current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev;  
            prev = current;  
            current = nextNode;  
        }
        return prev; 
    }

    //method to get the nth node from the end of a linked list
    public ListNode getNthNodeFromEnd(int n) {
        if(head == null) {
            return null;
        }
        if(n <= 0) {
            throw new IllegalArgumentException("inavlid value: n =" +n);
        }

        ListNode mainptr = head;
        ListNode refptr = head;
        int count = 0;
        while(count < n) {
            if(refptr == null ) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes in the list");
            }
            refptr = refptr.next;
            count++;
        }
        while(refptr != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;
    }

    // method to remove duplicates from a linked lsit 
public void removeduplicates() {
    if (head == null || head.next == null) {
        return; 
    }
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            current.next = current.next.next; 
        } else {
            current = current.next; 
        }
    }
}

// method to insert a node in a sorted linked list
public ListNode insertSpecificInSorted(int value) {
    ListNode newNode = new ListNode(value);
    if(head == null) {
        return newNode;
    }
    ListNode current = head;
    ListNode temp = null;
    while(current != null && current.data < newNode.data) {
        temp = current;
        current= current.next;
    }
    newNode.next = current;
    temp.next = newNode;
    return head;
}


//method to delete a node in a sorted linked list
public void deleteNodeInSorted(int key) { 
    ListNode current = head;
    ListNode temp = null;
    if(current != null && current.data == key) {
        head = current.next;
        return;
    }
    while(current != null && current.data != key) {
        temp = current;
        current = current.next;
    }
    if(current == null) {
        return;
    }
    temp.next = current.next;
}

    // Method to create a loop in the linked list
    public void createLoop() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; 
    }

    // Method to check if a loop exists
    public boolean containsLoop() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; 
            }
        }
        return false;
    }
    // Method to detect the start of the loop
    public int detectLoopStart() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { 
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow.data;
            }
        }
        return -1; 
    }

    // method to remove loop
    public void removeLoop() {
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                removeLoop(slow); 
                return;
            }
        }
    }
    
    // Helper function to remove the loop
    private void removeLoop(ListNode slowptr) {
        ListNode temp = head;
        while (slowptr.next != temp.next) {
            temp = temp.next;
            slowptr = slowptr.next;
        }
        slowptr.next = null;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
    
        ListNode head; // Head of the merged list
        if (l1.data <= l2.data) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }
    
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
    
        // Attach the remaining nodes (if any)
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
    
        return head;
    }
    
    


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        // Properly insert nodes instead of modifying `head` directly
        sll.insertEnd(10);
        sll.insertEnd(10);
        sll.insertEnd(1);
        sll.insertEnd(1);
        sll.insertEnd(3);
        sll.insertEnd(7);

        // Display initial linked list
        System.out.println("Original List:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Insert node at the beginning
        sll.insertStart(11);
        System.out.println("\nAfter inserting at the start:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Insert node at the end
        sll.insertEnd(15);
        System.out.println("\nAfter inserting at the end:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Insert node at a specific position
        sll.insertSpecific(3, 20);
        System.out.println("\nAfter inserting at position 3:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Delete first node
        sll.deleteFirst();
        System.out.println("\nAfter deleting first node:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Delete last node
        sll.deleteEnd();
        System.out.println("\nAfter deleting last node:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Delete node at a specific position
        sll.deleteSpecific(3);
        System.out.println("\nAfter deleting node at position 3:");
        sll.display();
        System.out.println("The length is " + sll.length());

        // Search a key in a linked list
        int key = 10;
        System.out.println("\nSearching for key: " + key);
        if (sll.find(sll.head, key)) {
            System.out.println("The key " + key + " is found.");
        } else {
            System.out.println("The key " + key + " is not found.");
        }

        // Reverse linked list
        System.out.println("\nReversing linked list:");
        sll.display(); 
        sll.head = sll.reverse(sll.head);
        System.out.println("Reversed List:");
        sll.display(); 

        //get nth node from the end of a linked list
        ListNode nthnode = sll.getNthNodeFromEnd(2);
        System.out.println("Nth node from the end is : "+ nthnode.data);
        sll.display();

        //remove duplicate from list
        sll.removeduplicates();
        System.out.println("after removing duplicates");
        sll.display();

        //insert a node in a sorted linked list
        sll.insertSpecificInSorted(12);
        System.out.println("after inseting a node in a sorted linked list");
        sll.display();

        //delete a node in a sorted linked list
        sll.deleteNodeInSorted(20);
        System.out.println("after deleteing a node in sorted linked list");
        sll.display();

        //checking loop or not and where from loop start
        sll.createLoop();
        
        boolean hasLoop = sll.containsLoop();
        System.out.println("Loop present: " + hasLoop);

        if (hasLoop) {
            System.out.println("Loop detected at node with value: " + sll.detectLoopStart());
        } else {
            System.out.println("No loop detected.");
        }

        // to remove loop 
        sll.removeLoop();
        System.out.println("after removing loop");
        sll.display();
        
    }
    }

