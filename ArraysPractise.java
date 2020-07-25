
public class ArraysPractise {
	public static void main(String[] args) {
	Array numbers=new Array(3);
	numbers.print();
	numbers.insert(5);
	numbers.print();
	numbers.insert(20);
	numbers.insert(30);
	numbers.insert(40);
//	numbers.removeAt(0);
	numbers.insertAt(2, 15);
	numbers.print();
//	System.out.print(numbers.indexOf(40));
	}
}
