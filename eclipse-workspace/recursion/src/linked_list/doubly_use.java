package linked_list;
import java.util.*;
public class doubly_use {
	public static  doubly_linked_node<Integer> takeinput(){
		
		Scanner sc=new Scanner(System.in);
		  int data=sc.nextInt();
		  doubly_linked_node<Integer> head=null;
		  while(data!=-1) {
		doubly_linked_node<Integer> newnode=new doubly_linked_node<Integer>(data);
		  if(head==null) {
			  head=newnode;
		  }else {
			  doubly_linked_node<Integer> temp=head;
			  while(temp.next!=null) {
				  temp=temp.next;
			  }
			  temp.next=newnode;  
		  } 
		  data=sc.nextInt();
		  }
		return head;
		
	}
	public static void print(doubly_linked_node<Integer> myhead) {
	
		while(myhead!=null) {
			System.out.print(myhead.data+" ");
			myhead=myhead.next;
		}
	}
	public static doubly_linked_node<Integer> insertatpint(doubly_linked_node<Integer>head,int data ,int pos){
		 doubly_linked_node<Integer> newnode=new doubly_linked_node<Integer>(data);
		 if(pos==0) {
			 newnode.next=head;
			 return  newnode;
		 }
		 doubly_linked_node<Integer> temp=head;
		 int i=0;
		 while(i<pos-1){
			 temp=temp.next;
			 i++;
		 }
		  newnode.next=temp.next;
		  temp.next=newnode;	
		
		return head;
	}
	public static doubly_linked_node<Integer> deletionpos(doubly_linked_node<Integer>head,int pos){
		if(pos==0) {
			
			head=head.next;
			return head;
		}
		int i=0;
		doubly_linked_node<Integer> temp=head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}   
		     if(temp.next.next==null) {
		    	 temp.next=null;
		    	 return head;
		     }
		      temp.next=temp.next.next;
	         return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_linked_node<Integer> node=new doubly_linked_node<Integer>(20);
		System.out.println(node.data);
		doubly_linked_node<Integer> head=takeinput();
		
		print(head);
		//head=insertatpint(head,10,5);
		head=deletionpos(head,4);
		System.out.println();
		print(head);
	
	}

}
