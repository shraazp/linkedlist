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
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		if(myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode))
			System.out.println("Linked list is created!!");
		else 
			System.out.println("Linked list not created!!!");
		}
	}
	

