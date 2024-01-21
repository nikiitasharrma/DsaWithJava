package practice.binarytree;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int levelSum = queue.size();
			List<Integer> list = new LinkedList<>();
			while(levelSum-- > 0) {
				TreeNode temp = queue.poll();
				if(temp.getLeft() != null) queue.offer(temp.getLeft());
				if(temp.getRight() != null) queue.offer(temp.getRight());
				list.add(temp.getVal());
			}
			result.add(list);
		}
		return result;
	}
}
