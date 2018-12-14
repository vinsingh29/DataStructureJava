package trees;

public class BinaryTree {

	public static class BinaryTreeNode {

		public int value;
		public BinaryTreeNode left;
		public BinaryTreeNode right;

		public BinaryTreeNode(int value) {
			this.value = value;
		}

		public BinaryTreeNode insertLeft(int leftValue) {
			this.left = new BinaryTreeNode(leftValue);
			return this.left;
		}

		public BinaryTreeNode insertRight(int rightValue) {
			this.right = new BinaryTreeNode(rightValue);
			return this.right;
		}
	}

	private static boolean isValidBST(BinaryTreeNode root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private static boolean isValidBST(BinaryTreeNode root, int minValue, int maxValue) {
		if (root == null)
			return true;

		// System.out.println("BST ( " + root.value + " , " + minValue + " , " +
		// maxValue + " )");

		if (root.value >= maxValue || root.value <= minValue) {
			return false;

		}

		return isValidBST(root.left, minValue, root.value) && isValidBST(root.right, root.value, maxValue);

	}

	// Recursive
	private static int findHighest(BinaryTreeNode root) {
	
		if (root == null)
			return 0;

		if (root.right != null) {
			System.out.println("in root.right if");
			return findHighest(root.right);
		}

		return root.value;

	}

	// Iterative
	private static int findHighestIterative(BinaryTreeNode root) {
		BinaryTreeNode CurrentNode = root;
		BinaryTreeNode largest = null;
		if (CurrentNode == null)
			return 0;

		while (CurrentNode != null) {

			if (CurrentNode.right == null) {
				largest = CurrentNode;
			}
			CurrentNode = CurrentNode.right;
		}

		return largest.value;

	}

	// Iterative find Second Highest Element in BST
	private static int secondHighestIterative(BinaryTreeNode root) {
		BinaryTreeNode CurrentNode = root;

		if (root == null || (root.left == null && root.right == null)) {
			throw new IllegalArgumentException("Tree must have at least 2 nodes");
		}
		
		while(true) {
			
			if(CurrentNode.left != null && CurrentNode.right == null) {
				return findHighestIterative(CurrentNode.left);
			}
			
			if(CurrentNode.right != null && CurrentNode.right.left == null && CurrentNode.right.right == null) {
				return CurrentNode.value;
			}
			CurrentNode = CurrentNode.right;
		}
				
		

	}

	public static void main(String[] args) {

		final BinaryTreeNode root = new BinaryTreeNode(50);
		final BinaryTreeNode a = root.insertLeft(30);
		a.insertLeft(10);
		a.insertRight(40);
		final BinaryTreeNode b = root.insertRight(70);
		b.insertLeft(60);
		b.insertRight(80);
		boolean res = isValidBST(root);
		if (res)
			System.out.println("Valid Binary Tree");
		else
			System.out.println("Not Valid Binary Tree");
		System.out.println(findHighest(root));
		System.out.println(findHighestIterative(root));
		System.out.println(secondHighestIterative(root));
	}

}
