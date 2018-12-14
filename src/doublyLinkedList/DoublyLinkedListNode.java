package doublyLinkedList;

public class DoublyLinkedListNode {
	private int data;
	
	private DoublyLinkedListNode nextNode, prevNode;

	public int getData() {
		return data;
	}

	public DoublyLinkedListNode(int data) {

		this.data = data;
	}

	public DoublyLinkedListNode(int data, DoublyLinkedListNode nextNode, DoublyLinkedListNode prevNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}

	public DoublyLinkedListNode() {

	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyLinkedListNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DoublyLinkedListNode prevNode) {
		this.prevNode = prevNode;
	}

}
