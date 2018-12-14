package stack;

import java.util.Arrays;

public class BasicStack {
	private Object[] array;
	private int top = -1;

	public boolean isEmpty() {
		if (top == -1) {

			return true;
		}

		return false;
	}

	public BasicStack(int capacity) {
		array = new Object[capacity];
	}

	public void push(Object item) {
		if (top == array.length - 1) {

			throw new IllegalStateException
			("Stack Overflow, "+ "element cannot be added");
		}
		top++;
		array[top] = item;
	}

	public Object pop() {

		if (isEmpty()) {

			throw new IllegalStateException
			("Stack Underflow" + ", Stack is Empty");
		}
		Object item = array[top];
		array[top] = null;
		top--;
		return item;
	}

	public String toString() {

		return "Stack content : " + Arrays.toString(array);
	}

}
