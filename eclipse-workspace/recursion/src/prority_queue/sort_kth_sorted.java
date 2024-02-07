package prority_queue;
import java.util.*;
public class sort_kth_sorted {
		public static void kthsort(int[]arr,int k){
			PriorityQueue<Integer> myqueue=new PriorityQueue<>();
			      int count=0;
			for(int i=0;i<k;i++) {
				myqueue.add(arr[i]);
				count++;
			}
			for(int i=count;i<arr.length;i++) {
				arr[i-k]=myqueue.remove();
				myqueue.add(arr[i]);
				
			}
			for(int i=0;i<k;i++) {
				arr[i+k]=myqueue.remove();
				//myqueue.add(arr[i]);
				
			}
		}
	public static void main(String[] args) {
		  int arr[]= {2,4,1,9,6,8};
		  int k=3;
		  kthsort(arr,k);
		  for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+" ");
		  }
	}

}
