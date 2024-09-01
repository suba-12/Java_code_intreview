package Linkedlist;

public class Circular {
    // Node class definition
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reference to the last node in the circular linked list
    private Node last = null;

    // Method to insert a node at the end of the circular linked list
    public void inserATENd(int data) {
        Node newnode = new Node(data);
        if (last == null) {
            // If the list is empty, newnode becomes the only node in the list
            last = newnode;
            last.next = newnode; // Pointing to itself
        } else {
            // Inserting newnode at the end of the list
            newnode.next = last.next; // newnode points to the first node
            last.next = newnode; // last node's next points to newnode
            last = newnode; // newnode becomes the new last node
        }
    }

    public void display(){
        if(last == null)
        System.out.println("list is full");
        Node temp = last.next;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;

        }while(temp != last.next);
    }

    // Main method to test the circular linked list
    public static void main(String[] args) {
        Circular list = new Circular();
        list.inserATENd(10);
        list.inserATENd(20);
        list.inserATENd(30);
        list.display();
        
        // Additional code to traverse and display the list can be added here.
        // For example, a method to print the list elements.
    }
}
