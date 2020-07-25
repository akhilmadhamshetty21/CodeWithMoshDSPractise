import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Queues {
	static int[] queue=new int[5];
	static int count=0;
	int start=0; 
	public static void enqueue(int num){
		queue[count]=num;
		count++;
	}
	public static void dequeue() {
		for(int i=0;i<queue.length-1;i++) {
			queue[i]=queue[i+1];
		}
		count--;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.print(queue[i]);
		}
		System.out.print("\n");
	}
	public int peek() {
		// TODO Auto-generated method stub
		return queue[0];
	}
	public boolean isEmpty() {
		return count==0;
	}
	public boolean isFull() {
		return count==5;
	}
	public void reverse(int k) {
		Stack tempstack=new Stack();
		Queue<String> waitingQueue = new LinkedList<>();
		for(int i=0;i<k;i++) {
			int num=peek();
			dequeue();
			tempstack.push(num);
		}
		while(!tempstack.isEmpty()) {
			int popelement=(int) tempstack.peek();
			tempstack.pop();
			reverse.enqueue(popelement);
		}
		for(int i=k;i<count-1;i++)
			reverse.enqueue(peek());
		System.out.print(reverse);
	}
	
}
