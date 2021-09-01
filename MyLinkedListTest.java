package linkedlist;



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
		MyNode<Integer> myFirstNode = new MyNode<>(560);
		MyNode<Integer> mySecondNode = new MyNode<>(300);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
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
		
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
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
	/**
	 * this method to add element between two nodes
	 */
	public static void insertBetween()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
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
	/**
	 * this method to call the method to delete first element
	 */
	public static void deleteFirst()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.pop();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printMyNodes();
	}
	/**
	 * this method to delete last node
	 */
	public static void deleteLast()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.popLast();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printMyNodes();
	}
	/**
	 * method to search for an element
	 * @return nothing
	 */
	public static void search()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
	
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> result = myLinkedList.search(30);
		if(result == null)
			System.out.println("Element not found");
		else
			System.out.println(result.getKey()+" found !!Search is successfull");
		myLinkedList.printMyNodes();
	}
	/**
	 * method to insert after a specified node
	 * @return nothing
	 */
	public static void insertAfterSpecified()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(40);
		
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode<Integer> temp = myLinkedList.search(30);
		if(temp != null) {
			INode<Integer> next = temp.getNext();
			temp.setNext(myFourthNode);
			myFourthNode.setNext(next);
		}else {
			System.out.println("Element not found");
		}
		myLinkedList.printMyNodes();
	}
	public static void deleteAfterSpecified()
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		SortedLinkedList<Integer> myLinkedList = new SortedLinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		INode<Integer> head = myLinkedList.deleteSpecified(40);
		int count = myLinkedList.countNode(head);
		System.out.println("Number of nodes in a linked list are "+count);
		myLinkedList.printMyNodes();
	}
	public static void main(String [] args) {
		//createLinkedlist();
		addNewNode();
		//appendNode();
		//insertBetween();
		//deleteFirst();
		//deleteLast();
		//search();
		//insertAfterSpecified();
		//deleteAfterSpecified();
	}
}
