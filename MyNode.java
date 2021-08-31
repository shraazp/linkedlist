/**
 * the MyNode class implements 
 * getter and setter functions which will set the key and next value
 * @author Shravya P
 */
package linkedlist;
public class MyNode<K> implements INode<K> {
	private K key;
	private INode<K> next;
	
	public MyNode(K Key) {
		this.key=Key;
		this.next=null;
	}
	@Override
	public K getKey() {
		return key;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
		}
	@Override
	public INode<K> getNext() {
		return next;
	}
	@Override
	public void setNext(INode<K> next) {
		this.next = next;	
	}	
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{" + "key=").append(key).append('}');
		if(next != null) {
			myNodeString.append("->").append(next);
		}
		return myNodeString.toString();
	}	
}
