package stack;

import java.util.LinkedList;

public class LinkedListStack {

	private LinkedList<Integer> stack = new LinkedList<Integer>();

	@SuppressWarnings("unused")
	private boolean isEmpty() {

		if (stack.isEmpty()) {
			return true;
		}

		return false;
	}

	private void push(int x) {

		stack.addLast(x);

	}

	@SuppressWarnings("null")
	private int pop() {
		if (stack.isEmpty()) {

			System.out.println("UnderFlow Error");
			return (Integer) null;
		}
		int ele = stack.removeLast();
		return ele;

	}

	private void display() {

		System.out.println("Stack Content : " + stack);

	}

	public static void main(String[] args) {

		LinkedListStack s = new LinkedListStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		s.display();

		System.out.println("Deleted element : " + s.pop());

		s.display();

	}

}
