
public class MaxHeap {
	public static int[] heapify(int[] numbers) {
		int lastParentIndex=(numbers.length-1)/2;
		for(int i=lastParentIndex;i>=0;i--) {
			heapify(numbers,i);
		}
		return numbers;
	}

	private static void heapify(int[] numbers, int i) {
		// TODO Auto-generated method stub
		int largerIndex=i;
		int leftIndex=2*i+1;
		if(leftIndex<numbers.length && numbers[i]<numbers[leftIndex])
			largerIndex=leftIndex;
		int rightIndex=2*i+2;
		if(rightIndex<numbers.length && numbers[i]<numbers[rightIndex])
			largerIndex=rightIndex;
		if(i==largerIndex)
			return;
		swap(numbers,i,largerIndex);
		heapify(numbers,largerIndex);
	}
		private static void swap(int[] numbers,int index, int parentindex) {
			// TODO Auto-generated method stub
			int temp=numbers[index];
			numbers[index]=numbers[parentindex];
			numbers[parentindex]=temp;
		}
	}

