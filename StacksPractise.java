import java.util.Stack;

public class StacksPractise {
	public static void main(String[] args) {
//		String str="abcds";
//		Stack stack=new Stack();
//		for(int i=0;i<str.length();i++) {
//			stack.push(str.charAt(i));
//		}
//		String rev="";
//		for(int i=0;i<str.length();i++) {
//			rev=rev+stack.pop();
//		}
//		System.out.print(rev);
//		Stacks stacktemp=new Stacks();
//		stacktemp.push(5);
//		stacktemp.push(15);
//		stacktemp.push(25);
//		stacktemp.push(35);
//		stacktemp.push(45);
//		stacktemp.push(8);
//		stacktemp.print();
//		stacktemp.pop();
//		stacktemp.print();
//		System.out.println(stacktemp.peek());
//		stacktemp.print();
		TwoStacks twostack=new TwoStacks();
		System.out.println(twostack.isEmpty1());
		twostack.push1(5);
		twostack.push1(25);
		twostack.push1(35);
		twostack.push1(50);
		twostack.push1(75);
		System.out.println(twostack.isEmpty2());
		twostack.push2(15);
		twostack.push2(50);
		twostack.push1(50);
		twostack.push1(75);
		twostack.print();
		twostack.pop1();
		twostack.pop1();
		twostack.pop2();
		twostack.pop2();
		twostack.print();
		System.out.println(twostack.isFull1());
		System.out.println(twostack.isEmpty2());
		twostack.push2(35);
		twostack.push2(35);
		twostack.push2(35);
		twostack.push2(35);
		twostack.push2(35);
		twostack.print();
		System.out.println(twostack.isFull2());
	}
}
