package balaji.AssistedPractice;

public class Doubly_LinkedList {

	  Node head, tail = null;

	  class Node {

	    int data;
	    Node prev;
	    Node next;

	    Node(int data) {
	      this.data = data;
	      this.prev = null;
	      this.next = null;
	    }
	  }

	  public void addNode(int data) {
	    Node newNode = new Node(data);
	    if (head == null) {
	      head = newNode;
	      tail = newNode;
	      head.prev = null;
	      tail.next = null;
	    } else {
	      tail.next = newNode;
	      newNode.prev = tail;
	      tail = newNode;
	      tail.next = null;
	    }
	  }

	  public void displayNode() {
	    Node currentNode = head;
	    if (head == null) {
	      System.out.println("Doubly Linked List Is Empty");
	      return;
	    }
	    System.out.println("Doubly Linked List Elements Are:");
	    while (currentNode != null) {
	      System.out.print(currentNode.data + " ");
	      currentNode = currentNode.next;
	    }
	  }

	  public static void main(String[] args) {
	    Doubly_LinkedList doublyLinkedList = new Doubly_LinkedList();
	    doublyLinkedList.addNode(111);
	    doublyLinkedList.addNode(222);
	    doublyLinkedList.addNode(333);
	    doublyLinkedList.addNode(444);
	    doublyLinkedList.addNode(555);
	    doublyLinkedList.addNode(666);
	    doublyLinkedList.displayNode();
	  }
	}