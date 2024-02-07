package practice;

public class quque_linhed_driver {
	public static void main(String args[]) throws queueEmptyException {
		queue<Integer> qi=new queue<>();
		for(int i=0;i<20;i++) {
			qi.enqueue(i);
		}
		for(int i=0;i<19;i++) {
			System.out.print(qi.dequeue()+" ");
		}
		System.out.print("This is the front of the queue:-"+qi.front()+" ");
		System.out.print("is thsi the queue is empty:-"+qi.isEmpty()+" ");
		for(int i=0;i<20;i++) {
			qi.enqueue(i);
		}
		System.out.print("current size of the queue is :-"+qi.size()+" ");
	}
}

