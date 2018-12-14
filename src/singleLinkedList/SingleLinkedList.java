package singleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {

	private SingleListNode head;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleLinkedList() {
	}

	public void create(int n) {

		for (int i = 0; i < n; i++) {
			SingleListNode p = new SingleListNode();
			System.out.println("Enter data for node " + (i + 1));
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int data = input.nextInt();
			p.setData(data);

			if (isEmpty()) {
				head = p;
				p.setNext(null);
			} else {
				SingleListNode q = head;

				while (q.getNext() != null)
					q = q.getNext();

				q.setNext(p);
				p.setNext(null);

			}

		}

	}

	public void insertEnd(int data) {
		SingleListNode newNode = new SingleListNode(data, null);
		SingleListNode p = head;
		while (p.getNext() != null) {
			p = p.getNext();
		}

		p.setNext(newNode);
		this.size++;

	}

	public void insertBegin(int data) {
		SingleListNode newNode = new SingleListNode(data, head);
		this.head = newNode;
		this.size++;

	}

	public SingleListNode deleteBegin() {
		SingleListNode removedNode = head;
		head = head.getNext();
		removedNode.setNext(null);
		this.size--;
		return removedNode;
	}

	public SingleListNode deleteEnd() {
		SingleListNode p = head;

		while (p.getNext().getNext() != null) {
			p = p.getNext();
		}
		SingleListNode removedNode = p.getNext();
		p.setNext(null);

		return removedNode;
	}

	public void display() {
		SingleListNode p = head;
		if (isEmpty())
			System.out.println("No Linked List Created");

		while (p != null) {
			System.out.print(p.getData() + " ");
			p = p.getNext();
		}
		System.out.println('\n');
	}

	public void sort() {
		SingleListNode p, q;
		int temp;
		if (isEmpty()) {

			throw new IllegalStateException("Linked List Not created");
		}
		for (p = head; p.getNext() != null; p = p.getNext()) {
			for (q = p.getNext(); q != null; q = q.getNext()) {
				if (p.getData() > q.getData()) {
					temp = p.getData();
					p.setData(q.getData());
					q.setData(temp);
				}
			}

		}

	}

	public void reverse() {

		SingleListNode p, q, r;
		p = head;
		q = null;

		while (p != null) {
			r = p.getNext();
			p.setNext(q);
			q = p;
			p = r;

		}
		head = q;

	}

	public boolean isEmpty() {
		return (head == null);

	}

}
