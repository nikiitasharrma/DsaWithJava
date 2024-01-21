package practice.binarytree;

import java.util.List;
import java.util.Scanner;

import practice.binarytree.dfs.DepthFirstSearch;

public class Tree {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		
		TreeNode root = BuildTree.deserialize(input);
		
		List<List<Integer>> list = LevelOrderTraversal.levelOrder(root);
		
		Print.printListOfList(list);
		
		List<List<Integer>> dfs = DepthFirstSearch.depthFirstSearch(root);
		
		Print.printListOfList(dfs);
		
	}
}
