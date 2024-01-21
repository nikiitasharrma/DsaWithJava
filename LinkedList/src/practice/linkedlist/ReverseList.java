package practice.linkedlist;

import java.util.Stack;

public class ReverseList {
	public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        head = stack.pop();
        temp = head;
        while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
