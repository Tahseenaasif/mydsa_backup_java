package prority_queue;

import java.util.*;
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length()) {
			return -1;
		}else if(o1.length()>o1.length()){
			return 1;
		}else {
			return 0;
		}
		
	}
	
}
public class comperator_class {

	public static void main(String[] args) {
		
		String arr[]= {"this","is","a","their","qestion"};
		StringLengthComparator stcomp=new StringLengthComparator();
		PriorityQueue<String> pq=new PriorityQueue<String>(stcomp);
		for(int i=0;i<arr.length;i++){
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");
			pq.remove();
		}
	}

}
