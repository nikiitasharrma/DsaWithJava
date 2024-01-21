package practice.binarytree;

import java.util.List;

public class Print {
	
	public static void printListOfList(List<List<Integer>> list) {
		System.out.print("[");
		int n = list.size(); int cnt = 0;
		for(List<Integer> li : list) {
			System.out.print("[");
			int size = li.size(); int count = 0;
			for(Integer i : li) {
				if(count == size-1) {
					System.out.print(i);
					break;
				}
				System.out.print(i + ",");
				count++;
			}
			if(cnt == n-1) {
				System.out.print("]");
				break;
			}
			System.out.print("],");
			cnt++;
		}
		System.out.print("]");
	}
	
	public static void printList(List<Integer> list) {
		int n = list.size(); int cnt = 0;
		System.out.print("[");
		for(Integer i : list) {
			if(cnt == n-1) {
				System.out.print(i);
				break;
			}
			System.out.print(i + ",");
			cnt++;
		}
		System.out.print("]");
	}
}
