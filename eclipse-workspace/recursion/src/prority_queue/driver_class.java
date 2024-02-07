package prority_queue;

public class driver_class {

	public static void main(String[] args) throws Prority_queue_exception, prority_queue_empty_exception {
		int arr[]= {5,4,3,2,1};
//		prority_queue myqueue=new prority_queue ();
//		
//		for(int i=0;i<arr.length;i++) {
//			myqueue.Insert(arr[i]);
//		}
//		System.out.println("the size of the prority queue "+	myqueue.size());
//		
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(myqueue.removeMin()+" ");
//		}
		max_prority_queue myqueuee=new max_prority_queue ();
		
		for(int i=0;i<arr.length;i++) {
			myqueuee.Insert(arr[i]);
		}
		System.out.println("the size of the prority queue "+	myqueuee.size());
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(myqueuee.removeMax()+" ");
		}
		
	}

}
