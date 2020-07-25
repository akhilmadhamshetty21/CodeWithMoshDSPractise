
public class QueuePractise {
	public static void main(String[] args) {
//		Queues queue=new Queues();
//		queue.enqueue(5);
//		queue.enqueue(10);
//		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.print();
//		queue.dequeue();
//		queue.print();
//		queue.dequeue();
//		queue.print();
//		queue.reverse(2);
//		System.out.print(queue.peek());
//		System.out.print(queue.isEmpty());
		LinkedListQueue lqueue=new LinkedListQueue();
		lqueue.enqueue(10);
		lqueue.enqueue(45);
		lqueue.enqueue(40);
		System.out.print(lqueue.peek());
		System.out.print(lqueue.count);
		lqueue.print();
		lqueue.dequeue();
		lqueue.dequeue();
		lqueue.print();
		lqueue.dequeue();
		
		System.out.print(lqueue.isEmpty());
	}
}
