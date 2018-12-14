package trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderIterative {
	
	public ArrayList<Integer> preOrderIterative(BinaryTreeNode root){
		 ArrayList<Integer> res = new  ArrayList<Integer>();
		 if(root == null) return res;
		 
		 Stack<BinaryTreeNode> s = new Stack<>();
		 s.push(root);
		 
		 while(!s.isEmpty()) {
			 BinaryTreeNode temp = s.pop();
			 res.add(temp.data);
			 
			 if(temp.left != null) {
				 s.push(temp.left);
			 }
			 
			 if(temp.right != null) {
				 s.push(temp.right);
			 }
			 
		 }
		 
		 
		 return res;
		
	}

}
