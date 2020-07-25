
public class Array {
	int num;
	int arr[];
	int count=0;
	public Array(int num) {
		super();
		this.num = num;
		arr=new int[num];
	}
	

	public void insert(int n) {
		String str;
		if(arr.length==count) {
			int[] arr1=new int[arr.length+1];
			for(int i=0;i<arr.length;i++) {
				arr1[i]=arr[i];
			}
			arr=arr1;
		}
		
			arr[count++]=n;
		
	}
	public void removeAt(int index) {
		for(int i=index;i<count-1;i++) {
			arr[i]=arr[i+1];
		}
		count--;
	}
	public int indexOf(int value) {
		for(int i=0;i<count;i++) {
			if(arr[i]==value)
				return i;
		}
		return -1;
	}


	public void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void insertAt(int index,int num) {
		int[] arr1=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		int temp=arr1[index];
		arr1[index]=num;
		for(int i=index+1;i<arr1.length;i++) {
			int temp1=arr1[i];
			arr1[i]=temp;
			temp=temp1;
		}
		arr=arr1;
		count++;
	}
	

}
