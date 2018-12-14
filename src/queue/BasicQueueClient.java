package queue;

public class BasicQueueClient {

	public static void main(String[] args) {
		BasicQueue queue = new BasicQueue(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);

	}

}
