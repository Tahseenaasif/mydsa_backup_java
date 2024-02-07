package queue;

public class dynamic_queue_using_arrays {

	private int data[];
	private int  front;
	private int rear;
	private int size;
	public dynamic_queue_using_arrays() {
		data=new int[10];
		front=01;
		rear=-1;
		size=0;
	}
	public dynamic_queue_using_arrays(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	public boolean iEmpty(){
	    return size==0;
   }
	public int size(){
		return size;
	}
	public int front()throws queueEmptyException{
		if(size==0) {
			throw new queueEmptyException();
		}
		return data[front];
	}
	
  public void enqueue(int element) {
	 if(size==data.length) {
		 int tempp[]=data;
		   int index=0;
		 data=new int[2*tempp.length];
		 for(int i=front;i<tempp.length;i++) {
			 data[index]=tempp[i];
			 index++;
		 }
		 for(int i=0;i<front;i++) {
			 data[index]=tempp[i];
			 index++;
		 }
		 front=0;
		 rear=tempp.length-1;
		 
	 }
	 if(size==0) {
		 front=0;
	 }
	 size++;
	rear=(rear+1)%data.length;
	
	data[rear]=element;
	
	}
  public int dequeue()throws queueEmptyException{
	  if(size==0) {
		  throw new queueEmptyException();
	  } 
	  int temp=data[front];
	  front=(front+1)%data.length;
	  size--;
	  if(size==0){
		  front=-1;
		  rear=-1;
	  }
	  return temp;
	  
  }

}
