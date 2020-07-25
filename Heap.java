
public class Heap {
	private int[] arr=new int[50];
	private int size=0;
	
	public void insert(int value) {
		if(size == arr.length)
			throw new IllegalStateException();
		arr[size++]=value;
		bubbleup();
	}
	private void bubbleup() {
		int index=size-1;
		int parentindex=(index-1)/2;
		while(index>0 && arr[index]>arr[parentindex]) {
			swap(index,parentindex);
			index=(index-1)/2;
		}
	}
	private void swap(int index, int parentindex) {
		// TODO Auto-generated method stub
		int temp=arr[index];
		arr[index]=arr[parentindex];
		arr[parentindex]=temp;
	}
	
	public int remove() {
	    if (isEmpty())
	      throw new IllegalStateException();

	    int root = arr[0];
	    arr[0] = arr[--size];

	    bubbleDown();

	    return root;
	  }

	  private void bubbleDown() {
	    int index = 0;
	    while (index <= size && !isValidParent(index)) {
	      int largerChildIndex = largerChildIndex(index);
	      swap(index, largerChildIndex);
	      index = largerChildIndex;
	    }
	  }

	  public boolean isEmpty() {
	    return size == 0;
	  }

	  private int largerChildIndex(int index) {
	    if (!hasLeftChild(index))
	      return index;

	    if (!hasRightChild(index))
	      return leftChildIndex(index);

	    return (leftChild(index) > rightChild(index)) ?
	            leftChildIndex(index) :
	            rightChildIndex(index);
	  }

	  private boolean hasLeftChild(int index) {
	    return leftChildIndex(index) <= size;
	  }

	  private boolean hasRightChild(int index) {
	    return rightChildIndex(index) <= size;
	  }

	  private boolean isValidParent(int index) {
	    if (!hasLeftChild(index))
	      return true;

	    boolean isValid = arr[index] >= leftChild(index);

	    if (hasRightChild(index))
	      isValid &= arr[index] >= rightChild(index);

	    return isValid;
	  }

	  private int rightChild(int index) {
	    return arr[rightChildIndex(index)];
	  }

	  private int leftChild(int index) {
	    return arr[leftChildIndex(index)];
	  }

	  private int leftChildIndex(int index) {
	    return index * 2 + 1;
	  }

	  private int rightChildIndex(int index) {
	    return index * 2 + 2;
	  }

	public void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
	}
	
	
}
