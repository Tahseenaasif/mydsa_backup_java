package practice;

public class queue<t> {
	private Node<t> front;
	private Node<t> rear;
	int size;
	public queue(){
		  front=null;
		  rear=null;
		  size=0;
	}
	public void enqueue(t element) {
		if(front==null && rear==null){
			Node<t> newnode=new Node<>(element);
			front=newnode;
			rear=newnode;
			size++;
			return;
	    }
		Node<t> newnode=new Node<>(element);
	     rear.next=newnode;
	     rear=rear.next;
	}
	public t dequeue() throws queueEmptyException{
		if(front==null && rear==null) {
			throw new queueEmptyException();
		}
		if(front.next==null) {
			t temp=front.data;
			front=null;
			rear=null;
			size--;
			return temp;
			
		}
		t temp=front.data;
	     front=front.next;
	      size--;
	      return temp;
		
		
	}
	public int size() {
		return size;
		
	}
	public boolean isEmpty() {
		return size==0;
	}
	public t front() throws queueEmptyException{
		if(front==null&& rear==null) {
			throw new queueEmptyException();
		}
		return front.data;
	}
	
}
