package linkedList;

public class ContainsCycle {

	public static class LinkedListNode {

		public int value;
		public LinkedListNode next;

		public LinkedListNode(int value) {
			this.value = value;
		}
	}

	public static boolean containsCycle(LinkedListNode firstNode) {

		LinkedListNode fastRunner = firstNode;
		LinkedListNode slowRunner = firstNode;

		while (fastRunner != null && fastRunner.next != null) {
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;

			if (fastRunner == slowRunner)
				return true;

		}

		return false;
	}

	private static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
		final LinkedListNode[] nodes = new LinkedListNode[values.length];
		for (int i = 0; i < values.length; ++i) {
			nodes[i] = new LinkedListNode(values[i]);
			if (i > 0) {
				nodes[i - 1].next = nodes[i];
			}
		}
		return nodes;
	}

	public static void main(String[] args) {

		final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] { 1, 2, 3, 4 });
		nodes[3].next = nodes[0];
		final boolean result = containsCycle(nodes[0]);
		if (result)
			System.out.println("Cyclic List");
		else
			System.out.println("Non Cyclic List");

	}

}
