package linkedlist;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		
	}	
	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
	
	
}
