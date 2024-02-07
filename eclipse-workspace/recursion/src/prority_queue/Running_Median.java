package prority_queue;
import java.util.*;
public class Running_Median {
	 public static void findMedian(int arr[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> med;
          // System.out.println(arr[0]+" ");
           // pq.add(arr[0]);
      //  System.out.println(arr[0]+" ");
          for(int i=0;i<arr.length;i++){
             int j=0;
            while(j<=i){
                pq.add(arr[j]);
                j++;
            } 
            //int k=0;
            med=new  ArrayList<Integer>();
           while(!pq.isEmpty()){
              med.add(pq.peek());
                 pq.remove();
                 //k++;
           }
         if(med.size()==1){
              System.out.print(med.get(0)+" ");
         }else if(med.size()==2){

                     int avg1=(med.get(0)+ med.get(1))/2;
                      System.out.print(avg1+" ");

         }else if(med.size()>2 && med.size()%2==0){

                  int eind=med.size()/2;
                  int avg=(med.get(eind-1)+ med.get(eind))/2;
                   System.out.print(avg+" ");
            
         }else{
                  int ind=med.size()/2;
                 System.out.print(med.get(ind)+" ");
         }

    }
    
    }

	public static void main(String[] args) {
		int arr[]={6,2,1,3,7,5};
		 findMedian(arr);
		 int arr2[]= {5,4,3,2,1};
		 System.out.println();
		 findMedian(arr2);
	}

}
