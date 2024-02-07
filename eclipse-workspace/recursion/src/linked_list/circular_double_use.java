package linked_list;
import java.util.*;

public class circular_double_use {
	public static circular_double_link<Integer> insert(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		circular_double_link<Integer> head=null;
		circular_double_link<Integer> tail=null;
		while(data!=-1){
			circular_double_link<Integer> newnode=new circular_double_link<Integer>(data);
			if(head==null) {
				head=newnode;
				tail=head;
			}else { 
				  tail.perv=newnode;
				  newnode.perv=tail;
				  tail.next=newnode;
				  newnode.next=head;
				  head.perv=newnode;
				  tail=tail.next;
				 
			}
			
			data=sc.nextInt();
			
		}
		  
	  return head;
	} 
	
	public static circular_double_link<Integer> insertppos(circular_double_link<Integer> head,int pos,int data){
		circular_double_link<Integer> newnode=new circular_double_link<Integer>(data);
		
		if(pos==0) {
			newnode.perv=head.perv;
			newnode.next=head;
			head=newnode;
			return head;
		}
		circular_double_link<Integer> temp=head;
		int i=0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
			
		}
		if(temp.next==head){
			newnode.perv=temp;
			temp.next=newnode;
			newnode.next=head;
			head.perv=newnode;;
			return head;
		}
		temp.next.perv=newnode;
		newnode.next =temp.next;
		temp.next=newnode;
		newnode.perv=temp;
		return head;
	}
	public static circular_double_link<Integer> delete(circular_double_link<Integer> head,int pos){
	    if(pos==0){
	    	head.perv.next=head.next;
	    	 head.next.perv=head.perv;
	    	
	    	head=head.next;
	    	return head;
	    }
	    circular_double_link<Integer> temp=head;
	    int i=1;
	    while(i<pos){
	    	  temp=temp.next;
	    	i++;
	    }
	    if(temp.next.next==head){
	    	   head.perv=temp;
	    	   temp.next=head;
	    	return head;
	    }
	    
	    temp.next=temp.next.next;
	    temp.next.perv=temp;
	    
		return head;
	}
	
	public static void print(circular_double_link<Integer> myhead) {
		circular_double_link<Integer> temp=myhead;
		do{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=myhead); 
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circular_double_link<Integer> head=insert();
		   print(head);
		   //int dataa=head.perv.data;
		  head=delete(head,4);
		 // head=insertppos(head,1,10);
		  System.out.println();
		   print(head);
		   
	}

}
