package practice.binarytree;

public class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;
	TreeNode(int val){
		this.setVal(val);
		setLeft(setRight(null));
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public TreeNode setRight(TreeNode right) {
		this.right = right;
		return right;
	}
}
