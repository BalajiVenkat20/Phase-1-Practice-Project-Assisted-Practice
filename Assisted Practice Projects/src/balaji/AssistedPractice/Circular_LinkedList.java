package balaji.AssistedPractice;

public class Circular_LinkedList {  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  

    
    public Node head = null;  
    public Node tail = null;  
  
    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            tail.next = newNode;  
            tail = newNode;  
            tail.next = head;  
        }  
    }  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Elements of the circular linked list are: ");  
             do{  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
    	Circular_LinkedList cl = new Circular_LinkedList();  
        cl.add(11);  
        cl.add(22);  
        cl.add(33);  
        cl.add(44);  
        cl.add(55);  
        cl.add(66);  
        cl.display();  
    }  
}  