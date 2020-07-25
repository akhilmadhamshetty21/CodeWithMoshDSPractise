
public class LinkedListQueue {
	Linked_List queue=new Linked_List();
//	Linked_List.Node lp_node = queue.new Node(4);
	int count=0;
	public void enqueue(int k) {
		queue.addLast(k);
		count++;
	}
	public void dequeue() {
		queue.removeFirst();
		count--;
	}
	public Linked_List.Node peek() {
		return queue.first;
	}
	public int size() {
		return queue.size();
	}
	public boolean isEmpty() {
		return count==0;
	}
	public void print() {
		// TODO Auto-generated method stub
		queue.print();
		
	}
}
