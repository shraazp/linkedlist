package linkedlist;

import sun.jvm.hotspot.ui.tree.BadAddressTreeNodeAdapter;

/**
 * the MyLinkedListTest class implements 
 * a main function which will create 3 nodes
 * outputs a statement linked list is created or not
 * @author Shravya P
 */


public class MyLinkedListTest {
	/**
	 * method to create a linked list without calling any functions
	 */
	public static void createLinkedlist()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
		if(myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)) {
			System.out.println("Nodes Created");
		}else {
			System.out.println("Error");
		}
	}
	/**
	 * method to add nodes to the linked list class
	 * @return nothing
	 */
	public static void addNewNode()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		if( myLinkedList.head.equals(myThirdNode) &&myLinkedList.head.getNext().equals(mySecondNode) &&	
						 myLinkedList.tail.equals(myFirstNode))
		{
			System.out.println("Nodes are added:");
			myLinkedList.printMyNodes();
		}
		else
			System.out.println("nodes are not added:");
	}
	/**
	 * this method is to append nodes into linked list
	 */
	public static void appendNode()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		if(myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) &&	myLinkedList.tail.equals(myThirdNode))
		{
			System.out.println("Nodes are added:");
			myLinkedList.printMyNodes();
		}
		else
			System.out.println("nodes are not added:");
	}
	
	public static void insertBetween()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		if(myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) &&	 myLinkedList.tail.equals(myThirdNode))
		{
			myLinkedList.printMyNodes();
		}else {
			System.out.println("Error") ;
		}
	}
	
	public static void main(String [] args) {
		//createLinkedlist();
		//addNewNode();
		//appendNode();
		insertBetween();
	}
}
