
public class TwoStacks {
	int[] stack=new int[4];
	int count1=0,count2=0,size=10;
	public void push1(int num) {
			int[] arr1=new int[stack.length+1];
			for(int i=0;i<stack.length;i++) {
				arr1[i]=stack[i];
			}
			int temp=arr1[count1];
			arr1[count1]=num;
			for(int i=count1+1;i<arr1.length;i++) {
				int temp1=arr1[i];
				arr1[i]=temp;
				temp=temp1;
			}
			stack=arr1;
		
		count1++;
		count2++;
	}
	public void push2(int num) {
		int i=0;
		if(count2<size) {
		stack[count2]=num;
		
		}
		else {
			int[] temp=new int[size+1];
			for(i=0;i<stack.length;i++) {
				temp[i]=stack[i];
			}
			temp[size]=num;
			stack=temp;
		}
		count2++;
	}
	public void print() {
		System.out.println("Stack1");
		for(int i=0;i<count1;i++) {
			System.out.println(stack[i]);
		}
		System.out.println("Stack2");
		for(int i=count1;i<count2;i++) {
			System.out.println(stack[i]);
		}
	}
	public void pop1() {
		for(int i=count1;i<stack.length-1;i++) {
			stack[i]=stack[i+1];
		}
		count1--;
		count2--;
	}
	public void pop2() {
		int[] temp=new int[size];
		count2--;
		for(int i=0;i<count2;i++) {
			temp[i]=stack[i];
		}
		stack=temp;
		
	}
	public boolean isEmpty1() {
		return count1==0;
	}
	public boolean isEmpty2() {
		return count2==5;
	}
	public boolean isFull1() {
		return count1 ==5;
	}
	public boolean isFull2() {
		return count2 ==10;
	}
}
