package singleLinkedList;

public class ReverseSLLClient {

	public static void main(String[] args) {

		SingleLinkedList L = new SingleLinkedList();

		L.insertBegin(10);
		L.insertBegin(50);
		L.insertEnd(2);
		L.display();
		L.reverse();
		L.display();

	}

}
