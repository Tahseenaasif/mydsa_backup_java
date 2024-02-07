package prority_queue;
import java.util.*;
public class max_prority_queue {
     ArrayList<Integer> heap;
     max_prority_queue(){
    	 heap=new ArrayList<Integer>();
     }
	int size(){
		return heap.size();
	}
	boolean isEmpty(){
		return heap.size()==0;
	}
	int getMax()throws prority_queue_empty_exception{
		if(heap.size()==0) {
			throw new prority_queue_empty_exception();
		}
		
		return heap.get(0);
	}
	void Insert(int element){
	    heap.add(element);
	    int children=heap.size()-1;
	    int parent=(children-1)/2;
	    while(children>0){
	    	if(heap.get(children)>heap.get(parent)) {
	    		int temp=heap.get(children);
	    		heap.set(children, heap.get(parent));
	    		heap.set(parent , null);
	    		children=parent;
	    		parent=(children-1)/2;
	    	}else {
	    		return ;
	    	}
	    	
	    	
	    }
	}
	int removeMax(){
		int ans=heap.get(0);
	    heap.set(0, heap.get(heap.size()-1));
	    heap.remove(heap.size()-1);
	    int index=0;
	    int maxindex=0;
	    int leftindex=1;
	    int  rightindex=2;
	    while(leftindex<heap.size()) {
	    	if(heap.get(leftindex)>heap.get(index)){
	    		 maxindex=leftindex;
	    	}
	    	if(rightindex<heap.size() &&heap.get(rightindex)>heap.get(maxindex)){
	    		maxindex=rightindex;
	    		
	    	}
	    	if(maxindex==index) {
	    	    break;
	    	}else {
	    		int temp=heap.get(maxindex);
	    		heap.set(maxindex, heap.get(index));
	    		heap.set(index,temp);
	    		index=maxindex;
	    		leftindex=2*index+1;
	    		rightindex=2*index+1;
	    	}
	    	    
	    }
		
		
		
		
		return ans;
	}
	

}
