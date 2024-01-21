package practice.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {
	
	public static TreeNode deserialize(String input) {
		String[] values = input.substring(1,input.length()-1).split(",");
		TreeNode root = new TreeNode(Integer.parseInt(values[0].trim()));
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int  idx = 1;
		int n = values.length;
		while(!queue.isEmpty() && idx < n) {
			TreeNode temp = queue.poll();
			if(!values[idx].trim().equals("null")) {
				temp.setLeft(new TreeNode(Integer.parseInt(values[idx].trim())));
				queue.offer(temp.getLeft());
			}
			idx++;
			if(idx < n && !values[idx].trim().equals("null")) {
				temp.setRight(new TreeNode(Integer.parseInt(values[idx].trim())));
				queue.offer(temp.getRight());
			}
			idx++;
		}
		return root;
	}
}
