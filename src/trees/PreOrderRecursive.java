package trees;

public class PreOrderRecursive {

	public void preOrderRec(BinaryTreeNode root) {

		if (root != null) {
			System.out.println(root.data);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}

	}

}
