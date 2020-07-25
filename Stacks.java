import java.util.Arrays;

public class Stacks {
	int size=5;
	int[] stack=new int[size];
	int count=0;
	
	public void push(int num) {
		int i=0;
		if(count<size) {
		stack[count]=num;
		
		}
		else {
			int[] temp=new int[size+1];
			for(i=0;i<stack.length;i++) {
				temp[i]=stack[i];
			}
			temp[size]=num;
			stack=temp;
		}
		count++;
	}
	
	public void pop() {
		int[] temp=new int[size];
		count--;
		for(int i=0;i<count;i++) {
			temp[i]=stack[i];
		}
		stack=temp;
		
	}
	
	public int peek() {
		return stack[count-1];
	}
	
	public boolean isEmpty() {
		return count==0;
	}

	public void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++) {
			System.out.println(stack[i]);
		}
		
	}
}
