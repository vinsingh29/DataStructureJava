package doublyLinkedList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoublyLinkedList {

	private DoublyLinkedListNode start = null, last = null;
	private int size = 0;

	public void insertBegin(int data) {
		DoublyLinkedListNode tmp = new DoublyLinkedListNode(data, start, null);
		if (start != null) {
			start.setPrevNode(tmp);
		}
		start = tmp;
		if (last == null) {
			last = tmp;
		}
		this.size++;
		System.out.println("adding at begining: " + data);
	}

	public void insertEnd(int data) {
		DoublyLinkedListNode tmp = new DoublyLinkedListNode(data, null, last);
		if (last != null) {
			last.setNextNode(tmp);
		}
		last = tmp;
		if (start == null) {
			start = tmp;
		}
		this.size++;
		System.out.println("adding at end: " + data);

	}

	public void create(int n) {

		for (int i = 0; i < n; i++) {
			DoublyLinkedListNode p = new DoublyLinkedListNode();
			p.setNextNode(null);
			p.setPrevNode(null);

			System.out.println("Enter data for node " + (i + 1));
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int data = input.nextInt();
			p.setData(data);

			if (isEmpty()) {
				start = p;
				last = p;
				this.size++;
			} else {
				p.setNextNode(start);
				start.setPrevNode(p);
				start = p;
				this.size++;
			}

		}

	}

	public void display() {
		if (isEmpty())
			System.out.println("No Linked List Created");

		for (DoublyLinkedListNode i = start; i != null; i = i.getNextNode()) {

			System.out.print(i.getData() + " ");
		}

		System.out.println('\n');

	}

	private boolean isEmpty() {

		if (start == null)
			return true;
		return false;
	}

	public void deleteEnd() {

		if (this.size == 0)
			throw new NoSuchElementException();
		DoublyLinkedListNode tmp = last;
		last = last.getPrevNode();
		last.setPrevNode(null);
		this.size--;
		System.out.println("deleted: " + tmp.getData());

	}

	public void deleteBegin() {

		if (this.size == 0)
			throw new NoSuchElementException();
		DoublyLinkedListNode tmp = start;
		start = start.getNextNode();
		start.setPrevNode(null);
		this.size--;
		System.out.println("deleted: " + tmp.getData());

	}

}
