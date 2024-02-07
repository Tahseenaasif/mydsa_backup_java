package prority_queue;

public class heap_sort_implace {
     public static void insertimplace(int arr[],int i){
    	 int childindex=i;
    	 int parentindex=(childindex-1)/2;
    	 while(childindex>0){
    		 if(arr[childindex]<arr[parentindex]){
    		 int temp=arr[childindex];
    		 arr[childindex]=arr[parentindex];
    		 arr[parentindex]=temp;
    		 childindex=parentindex;
    		 parentindex=(childindex-1)/2;
    	 }else {
    		 return ;
    	 }
    	 }
    		 
     }
     public static int removeimplace(int[] arr, int size) {
 		int ans=arr[0];
 		 arr[0]=arr[size];
 		 int index=0;
 		 int minindex=index;
 		 int leftindex=1;
 		 int rightindex=2;
 		  size--;
 		 
 		 while(leftindex<size){
 			 if(arr[leftindex]<arr[index]) {
 				 minindex=leftindex;
 			 }
 			 if(arr[rightindex]<arr[minindex]) {
 				 minindex=rightindex;
 			 }
 			 if(minindex!=index) {
 				 int temp=arr[minindex];
 				   arr[minindex]=arr[index];
 				   arr[index]=temp;
 				   index=minindex;
 				   leftindex=2*index+1;
 				   rightindex=2*index+2;
 			 }else {
 				 break;
 			 }
 			   
 			 
 		 }
 		 
 		 
 		return ans;
 	}
	public static void main(String[] args) {
		int arr[]= {5,1,9,2,0,6};
		for(int i=0;i<arr.length;i++) {
			insertimplace(arr,i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
		for(int i=0;i<arr.length;i++){
			 arr[arr.length-1-i]=removeimplace(arr,arr.length-1-i);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	 

}
