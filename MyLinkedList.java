package linkedlist;
/**
 * class contains different operations for linked list
 * @author Shravya P
 * @version 16.0
 * @param <K> the data type of the elements of linked list
 */
public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
	/**
	 * this methods adds a new element to the linked list
	 * @param newNode the value of the element of new node
	 * @return nothing
	 */
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K>tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	/**
	 * method to print the nodes of linked list
	 * @return nothing
	 */
	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
	
	
}
