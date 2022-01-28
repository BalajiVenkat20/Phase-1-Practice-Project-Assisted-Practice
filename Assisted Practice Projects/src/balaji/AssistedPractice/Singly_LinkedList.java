package balaji.AssistedPractice;

	public class Singly_LinkedList {    
	    class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	     
	    public Node head = null;    
	    public Node tail = null;    
	        
	    public void addNode(int data) {    
	        ////Creating a node    
	        Node newNode = new Node(data);    
	            
	        if(head == null) {    
	            head = newNode;    
	            tail = newNode;    
	        }    
	        else {    
	            tail.next = newNode;    
	         
	            tail = newNode;    
	        }    
	    }    
	        
	    public void display() {    
	           Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Elements of singly linked list: ");    
	        while(current != null) {    
	              
	        	
	        	   System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    
	        
	    public static void main(String[] args) {    
	            
	        Singly_LinkedList singlyList = new Singly_LinkedList();    
	            
	        singlyList.addNode(10);    
	        singlyList.addNode(20);    
	        singlyList.addNode(30);    
	        singlyList.addNode(50);    
	        singlyList.addNode(60);    
	        singlyList.addNode(70);    
	        singlyList.addNode(80);    
	           
	        singlyList.display();    
	    }    
	}