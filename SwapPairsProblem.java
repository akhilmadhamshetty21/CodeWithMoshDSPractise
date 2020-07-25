import java.util.HashMap;
import java.util.Stack;

public class SwapPairsProblem {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  
	 public ListNode swapPairs(ListNode head) {
		 Stack stack=new Stack();
		 String str;
		 HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();		 	        
		 ListNode temp2=head,temp=head,temp1=head;
	        while(temp2.next.next!=null){
	            temp1=temp2;
	            System.out.println(temp1.val);
	            temp=temp1.next;
	            System.out.println(temp.val);
	            temp2=temp.next;
	            System.out.println(temp2.val);
	            temp.next=temp1;
	            System.out.println(temp.next.val);
	        }
	        return head;
	    }
	 public void main(String[] args) {
		 
	 }
}
}

