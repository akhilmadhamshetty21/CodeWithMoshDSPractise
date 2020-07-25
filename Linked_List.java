import java.util.HashSet;

public class Linked_List {
	 class Node {
		public int value;
		public Node next;
		public Node(int value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
			
		}	
	}

	public Node first;
	public Node last;
	
	public Linked_List() {
		super();
		first=null;
		last=null;
	}

	public void addLast(int value) {
		Node newNode=new Node(value);
		if(first==null)
			first=last=newNode;
		else {
			last.next=newNode;
			last=newNode;
		}
	}
	public void addFirst(int value) {
		Node newNode=new Node(value);
		if(first==null)
			first=last=newNode;
		else {
			newNode.next=first;
			first=newNode;
		}
			
	}
	public void indexOf(int value) {
		Node temp=first;
		int i=0;
		while(temp!=null) {
			if(temp.value==value) {
				System.out.print("Value found at"+i);
			}
			temp=temp.next;
			i=i+1;
		}
	}
	
	public void removeFirst() {
		if(first==null)
			System.out.println("It is an empty linked list");
		if(first.next==null)
			first=null;
		else {
		Node temp=first.next;
		temp.next=first.next.next;
		first=temp;
		}
	}
	
	public void removeLast() {
		int i=0,j=0;
		Node temp=first;
//		System.out.print("hello");
		while(temp!=last) {
			i++;
			temp=temp.next;
		}
		System.out.print(i);
		temp=first;
		for(j=0;j<i-1;j++) {
			temp=temp.next;
//			System.out.print(temp);
		}
		temp.next=null;
		last=temp;
	}
	
	public int size() {
		int count=0;
		Node temp=first;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;	
	}
	
	public boolean contains(int value) {
		Node temp=first;
		while(temp!=null) {
			if(temp.value==value) {
				return true;
			}
			temp=temp.next;
		}
		return false;
		
	}
	
	
	public void print() {
		// TODO Auto-generated method stub
//		Node temp=new Node(0);
//		temp=first;
//		while(temp!=null) {
//			System.out.print(temp);
//			temp=temp.next;
//		}\
		System.out.println(first);
	}
	
	public Node getBefore(Node node) {
		Node temp=first;
		while(temp.next!=node) {
			temp=temp.next;
		}
		return temp;
	}	

	public void reverse() {
		// TODO Auto-generated method stub
	/*
	 *  10 --> 20 --> 30 
	 *  p      c      n
	 *  We will be first assigning previous to 10 and current to 20 and save the next element to 30 so that can be tracked 
	 *  for the next iteration
	 */
		Node previous=first;
		Node current=first.next;
		
		while(current!=null) {
			Node next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		last=first;
		last.next=null;
		first=previous;
	}

	public Node kthNodeFromLast(int k) {
		// TODO Auto-generated method stub
		/* 10->20->30
		 * t1      t2
		 */
		Node t1=first;
		Node t2=first;
		for(int i=1;i<=k-1;i++) {
			t2=t2.next;
		}
		while(t2!=last) {
			t1=t1.next;
			t2=t2.next;
		}
		return t1;
	}
	public void printMiddle() {
		Node middle=first,forward = first;
		while(forward!=last && forward.next!=last) {
			middle=middle.next;
			forward=forward.next.next;
		}
		if(forward==last) {
			System.out.println(middle.value);
		}
		if(forward.next==last) {
			System.out.println(middle.value+","+middle.next.value);
		}
	}

}
