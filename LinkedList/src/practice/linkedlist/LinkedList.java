package practice.linkedlist;

import java.util.Scanner;

public class LinkedList {
	
	private static ListNode conversionList(int[] arr){
        int n = arr.length;
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for(int i = 1; i < n; i++){
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
	
    private static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        ListNode head = conversionList(arr);
        ListNode reverse = ReverseList.reverseList(head);
        display(reverse);
	}

}
