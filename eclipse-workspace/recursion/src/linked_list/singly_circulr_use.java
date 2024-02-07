package linked_list;import java.util.*;

public class singly_circulr_use {
	
	
	public static sigle_circular<Integer> insertion(){
		
		    Scanner sc =new Scanner(System.in);
		    		int data=sc.nextInt();
		      sigle_circular<Integer>head=null;
		      sigle_circular<Integer>tail=null;
		      while(data!=-1) {
		    		if(head==null) {
		    			sigle_circular<Integer> newnode = new sigle_circular<Integer>(data);
		    			head=newnode;
		                tail=head;
		    		}else {
		    			
		    			sigle_circular<Integer> newnode = new sigle_circular<Integer>(data);
		    			tail.next=newnode;
		    			tail=tail.next;
		    			tail.next=head;
		    			
		    			 
		    		}
		    			data=sc.nextInt();
		    		 }
		
		return head;
     }
		      
//	    public static sigle_circular<Integer> insertion(){
//		
//	    Scanner sc =new Scanner(System.in);
//	    		int data=sc.nextInt();
//	      sigle_circular<Integer>head=null;
//	      sigle_circular<Integer>tail=null;
//	      while(data!=-1) {
//	    		if(head==null) {
//	    			sigle_circular<Integer> newnode = new sigle_circular<Integer>(data);
//	    			head=newnode;
//	    			ta
//	    		}else {
//	    			
//	    			sigle_circular<Integer> newnode = new sigle_circular<Integer>(data);
//	    			 sigle_circular<Integer>temp=head;
//	    			while(temp.next!=null || temp.next!=head ){
//	    				temp=temp.next;
//	    			}
//	    			temp.next=newnode;
//	    			newnode.next=head;
//	    		}
//	    		
//	    			data=sc.nextInt();
//	        }
//	
//	return head;
// }

	public static void print(sigle_circular<Integer>head){
		sigle_circular<Integer>temp=head;
		do {   
			
			System.out.print(temp.data+" ");
			temp=temp.next;

		}while(temp!=head);
			//System.out.print(temp.data+" ");
			
		
		//System.out.print(temp.next.data+" ");
		
	}
	public static sigle_circular<Integer> delete(sigle_circular<Integer>head,int pos) {
		  if(pos==0){
		  sigle_circular<Integer>tail=head;
			while(tail.next!=head) {
				tail=tail.next;
			}
			head=head.next;
			tail.next=head;
			return head;
		} 
		 sigle_circular<Integer>tail=head;
			  int c=1;
			while(c<pos){
		
				tail=tail.next;
				
				if(tail.next.next==head){
					tail.next=head;
					return head;
				}
				
				c++;
			}
			tail.next=tail.next.next;
			
			return head;
		}
	
		
		
	
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sigle_circular<Integer> head=insertion();
		  print(head);
		 head =delete(head,4);
		 System.out.println();
		  print(head);
		//System.out.print(head.data+" ");
	}

}
