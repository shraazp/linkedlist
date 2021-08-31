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
	 * @param newNode the value of the  of new node
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
	 * this method to append a new element to the linked list
	 * @param newNode the value of the  of new node
	 */
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	/**
	 * this method helps to insert a new node after the required node
	 * @param myNode node after which new node should be inserted
	 * @param newNode new node created
	 * @return nothing
	 */
	public void insert(INode<K> myNode,INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	/**
	 * method o delete the first element of the linked list
	 * @return new head
	 */
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	/**
	 * method to print the nodes of linked list
	 * @return nothing
	 */
	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
	
	
}
