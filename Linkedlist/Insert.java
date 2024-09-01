package Linkedlist;

public class Insert {

    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } 
    
    class LinkedList {
        private Node head;
    
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void deleteAtEnd( int data){
            if(head==null)
            System.out.println("list is empty");

            if(head.next==null){
                head = null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next =null;
        }
        
        public void insertAtBegin(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
    public void insertAtPos(int data,int pos){ // specific position
        Node newnode = new Node(data);
        if(pos == 1){
            newnode.next = head;head = newnode;
            return;
        }else{
            Node temp = head;
            for (int index = 1; index < pos - 1; index++) { // linked list poisition starts 1
                if(temp != null){
                    temp = temp.next;
                }
              /*   else{
                    System.out.println("out of bounce");
                }*/
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new Insert().new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(17);
        ll.insertAtEnd(23);
        ll.insertAtBegin(35);
        ll.deleteAtEnd(35);
        ll.insertAtPos(38,3);
        ll.display();
    } 
}
