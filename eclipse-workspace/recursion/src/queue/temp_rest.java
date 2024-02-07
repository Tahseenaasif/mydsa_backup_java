package queue;

public class temp_rest {

	public static void main(String[] args) throws queueEmptyException, queuefullException {
		// TODO Auto-generated method stub
		
			queues_temp q1=new queues_temp(20);
			for(int i=0;i<20;i++) {
				q1.enqueue(i);
			}
			System.out.print("the size of the queue is:-  "+q1.size());
			System.out.println();
			for(int i=0;i<20;i++) {
				System.out.print(q1.dequeue()+" ");
			}
					System.out.print(" "+q1.isEmpty()+" ");
					System.out.print("the size of the queue is:-  "+q1.size());
					System.out.println();
		}


	}


