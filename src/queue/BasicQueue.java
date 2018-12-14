package queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BasicQueue {
	private Object[] array;
	private int size = 0;
	private int head = 0; // index of the current front item, if one exists
	private int tail = 0; // index of next item to be added

	public BasicQueue(int capacity) {
		array = new Object[capacity];
	}

	public void enqueue(Object item) {
		if (size == array.length) {
			throw new IllegalStateException("Cannot add to full queue");
		}
		array[tail] = item;
		tail = (tail + 1) % array.length;
		size++;
	}

	public Object dequeue() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot remove from empty queue");
		}
		Object item = array[head];
		array[head] = null;
		head = (head + 1) % array.length;
		size--;
		return item;
	}

	public Object peek() {
		if (size == 0) {
			throw new NoSuchElementException("Cannot peek into empty queue");
		}
		return array[size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "Queue " + Arrays.toString(array);
	}

}