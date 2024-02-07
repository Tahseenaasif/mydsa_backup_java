package queue;


public class queue_using_arrays {

	public static void main(String[] args) throws queuefullException, queueEmptyException {
		// TODO Auto-generated method stub
//		queue_arrays q1=new queue_arrays(111);
//		for(int i=0;i<111;i++) {
//			q1.enqueue(i);
//	}
//		for(int i=0;i<111;i++) {
//			System.out.print(q1.dequeue()+" ");
//		}
			dynamic_queue_using_arrays q2=new dynamic_queue_using_arrays();
			for(int i=0;i<10000;i++) {
				q2.enqueue(i);
		}
			//System.out.print(q2.front()+" ");
			for(int i=0;i<10000;i++) {
				System.out.print(q2.dequeue()+" ");
	}

}
}
