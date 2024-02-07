package queue;

public class queue_using_linklist<t> {
			private node<t> front;
			private node<t> rear;
			int size;
			public queue_using_linklist() {
				front=null;
				rear=null;
				size=0;
			}
			
	public boolean isEmpty(){
		 return size==0;
	}
	public int size(){
		return size;
	}
	public t front()throws queueEmptyException{
		if(size==0) {
			throw new queueEmptyException();
		}
		return front.data;
	}
	public void enqueue(t element){
		node<t> newnode=new node<> (element);
		if(front==null) {
			  front= newnode;
			  rear=newnode;
			  size++;
		}else {
			rear.next=newnode;
			rear=newnode;
			size++;
		}
	
	}
	public t dequeue() throws queueEmptyException{
		if(size==0) {
			 throw new  queueEmptyException();
		}
		t temp=front.data;
		    if(size==1) {
		    	 rear=null;
		     }
		    front=front.next;
		    size--;
		return temp;
		
	}
	public static void main(String[] args) throws queueEmptyException {
		queue_using_linklist<Integer> q1=new queue_using_linklist<>();
		 for(int i=0;i<100;i++){
			 q1.enqueue(i);
			 
			 
		 }
		 for(int i=0;i<100;i++){
			
			 System.out.print(q1.dequeue()+" ");
			 
		 }
	}
}
