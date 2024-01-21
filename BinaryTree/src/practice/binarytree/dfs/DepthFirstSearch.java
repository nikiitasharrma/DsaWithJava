package practice.binarytree.dfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import practice.binarytree.BuildTree;
import practice.binarytree.Print;
import practice.binarytree.TreeNode;

public class DepthFirstSearch {
	
	//Pre-order, In-order and Post-order in one traversal
	public static List<List<Integer>> depthFirstSearch(TreeNode root){
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		List<Integer> pre = new LinkedList<Integer>();
		List<Integer> in = new LinkedList<Integer>();
		List<Integer> post = new LinkedList<Integer>();
		
		Stack<Pair> stack = new Stack<Pair>();
		stack.push(new Pair(root,1));
		
		while(!stack.isEmpty()) {
			Pair it = stack.pop();
			
			if(it.visited == 1) {
				pre.add(it.node.getVal());
				it.visited++;
				stack.push(it);
				if(it.node.getLeft() != null) stack.push(new Pair(it.node.getLeft(),1));
			}
			
			else if(it.visited == 2) {
				in.add(it.node.getVal());
				it.visited++;
				stack.push(it);
				if(it.node.getRight() != null) stack.push(new Pair(it.node.getRight(),1));
			}
			
			else {
				post.add(it.node.getVal());
			}
		}
		result.add(pre);
		result.add(in);
		result.add(post);
		return result;
	}
	
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		TreeNode root = BuildTree.deserialize(input);
		
		List<List<Integer>> dfs = DepthFirstSearch.depthFirstSearch(root);
		
		Print.printListOfList(dfs);
		
	}  
	
}
