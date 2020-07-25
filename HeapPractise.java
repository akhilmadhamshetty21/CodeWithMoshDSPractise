import java.util.Arrays;

public class HeapPractise {
	public static void main(String[] args) {
		Heap heap=new Heap();
		heap.insert(30);
		heap.insert(5);
		heap.insert(45);
		heap.insert(20);
		heap.print();
		heap.remove();
		heap.print();
		int[] numbers= {5,3,8,4,1,2};
		MaxHeap maxheap=new MaxHeap();
		System.out.print(Arrays.toString(maxheap.heapify(numbers)));
	}
}
