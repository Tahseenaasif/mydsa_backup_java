package queue;

public class queues_temp {
			private int data[];
			private int front;
			private int rear;
			private int si;
			public queues_temp(int size){
				data=new int [size];
				si=size;
				front=-1;
				rear=-1;
				
			}
			public void enqueue(int element) throws queueEmptyException, queuefullException{
				 if((rear+1)%si==front) {
					 throw new queuefullException();
					 
				 }
				 if(front==-1) {
					front=0;
					 
				 }
				 rear=(rear+1)%si;
				 data[rear]=element;
			}
			public int dequeue() throws queueEmptyException{
				  if(front==-1) {
					  throw new queueEmptyException();
					  
				  }   
				  
				  if(front==rear) {
					  int ans=data[front];
					  front=-1;
					  rear=-1;
					  return ans;
				  }
				    int res=data[front];
				  front=(front+1)%si;
				  return res;
				  		  
			}
			public int front() throws queueEmptyException{
			  if(front==-1){
					throw new queueEmptyException();   
				  
				}
			  return data[front];
			}
		public boolean isEmpty() {
			if(front==-1&&rear==-1) {
				return true;
			}
			return false;
			
		}
		public int  size() {
			if(front==-1 &&rear==-1) {
				return 0;
			}
			int first=front;
			int second=rear;
			int count=1;
			while(first!=second){
				first=(first+1)%si;
				count++;
			}
			return count;
		}
		
}
