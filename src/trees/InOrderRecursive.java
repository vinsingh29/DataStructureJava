package trees;

public class InOrderRecursive {

	public void inOrderRec(BinaryTreeNode root) {
		if (root != null) {

			inOrderRec(root.left);
			System.out.println(root.data);
			inOrderRec(root.right);
		}

	}

}
