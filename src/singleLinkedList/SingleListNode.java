package singleLinkedList;

public class SingleListNode {
	private int data;
	private SingleListNode nextNode;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SingleListNode getNext() {
		return nextNode;
	}

	public void setNext(SingleListNode next) {
		this.nextNode = next;
	}

	public SingleListNode() {

	}

	public SingleListNode(int val) {
		data = val;
	}

	public SingleListNode(int val, SingleListNode next) {
		data = val;
		this.nextNode = next;
	}

}