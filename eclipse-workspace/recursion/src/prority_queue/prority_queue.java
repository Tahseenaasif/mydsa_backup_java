package prority_queue;
import java.util.*;
public class prority_queue {
	private ArrayList<Integer>heap;
	prority_queue(){
		heap=new ArrayList<>();
	}
	
	boolean isEmpty(){
		return heap.size()==0;
	}
	
	int size() {
		return heap.size();
	}
	int getMin() throws prority_queue_empty_exception {
		if(heap.isEmpty()) {
			throw new  prority_queue_empty_exception();
		}
		return heap.get(0);
	}
	
	void Insert(int element) {
		heap.add(element);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		
		while(childindex>0) {
		 if(heap.get(childindex)<heap.get(parentindex)) {
			    int temp=heap.get(parentindex);
			    heap.set(parentindex, heap.get(childindex));
			    heap.set(childindex, temp);
			    childindex=parentindex;
			    parentindex=(childindex-1)/2;
		 }else {
			 return ;
		 }
		      
		}
	}
	int removeMin() throws prority_queue_empty_exception{
		if(heap.isEmpty()){
			throw new prority_queue_empty_exception ();
		}
        int ans=heap.get(0);
		heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
		int index=0;
	 	int minindex=index;;
		  int leftchild=1;
		  int rightchild=2;

        while(leftchild<heap.size()){
		if(heap.get(leftchild)<heap.get(minindex)){
			  minindex=leftchild;
		}
		if(rightchild<heap.size() && heap.get(minindex)>heap.get(rightchild)){
			minindex=rightchild;
		} 
		 if(minindex==index){
			break;
		}else{
		int temp=heap.get(index);
		heap.set(index,heap.get(minindex));
		heap.set(minindex,temp);
		index=minindex;
		leftchild=2*index+1;
		rightchild=2*index+2;
		}
		
		}
		
	  return ans;
	}

}

