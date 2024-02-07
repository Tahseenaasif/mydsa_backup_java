package queue;


public class queue_arrays{
	private int data[];
	private int  front;
	private int rear;
	private int size;
	public queue_arrays() {
		data=new int[10];
		front=01;
		rear=-1;
		size=0;
	}
	public queue_arrays(int capacity) {
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
  public void enqueue(int element)throws  queuefullException {
	 if(size==data.length) {
		 throw new queuefullException();
	 }
	rear=(rear+1)%data.length;
	size++;
	data[rear]=element;
	
	}
  public int dequeue()throws queueEmptyException{
	  if(size==0) {
		  throw new queueEmptyException();
	  } 
	  front=(front+1)%data.length;
	  int temp=data[front];
	  size--;
	  if(size==0){
		  front=-1;
		  rear=-1;
	  }
	  return temp;
	  
  }

}
