package linkedlist;
/**
 * the MyLinkedListTest class implements 
 * a main function which will create 3 nodes
 * outputs a statement linked list is created or not
 * @author Shravya P
 */


public class MyLinkedListTest {
	public static void main(String [] args) {
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
			System.out.println("Linked list is created:");
			myLinkedList.printMyNodes();
		}
		else
			System.out.println("Linked list is not created:");
	}
	
}
