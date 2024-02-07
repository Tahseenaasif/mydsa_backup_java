package linked_list;
import  java.util.*;
public class node_1_use {
	public static node_1<Integer> getinput()
	{
		node_1<Integer> head= null;
		Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			while(data!=-1) {
				node_1<Integer> newnode=new node_1<Integer>(data);
				if(head==null) {
					head=newnode;
				}else {
					node_1<Integer> temp=head;
					while(temp.next!=null) {
					  temp=temp.next;
					
				}
					temp.next=newnode;
			}
				data=sc.nextInt();
			}
		
		
		return head;
	}
	public static node_1<Integer> insertopt(){
		node_1<Integer> head=null;
		node_1<Integer> tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1)
		{   node_1<Integer> newnode=new node_1<Integer>(data);
					if(head==null) {
						head=newnode;
						tail=newnode;
					}else {
						tail.next=newnode;
						tail=tail.next;
						
					}
					data=sc.nextInt();
		}
		return  head;
	}
	public static node_1<Integer> insert(node_1<Integer>head,int data,int pos){
		node_1<Integer> newnode=new node_1<>(data);
	        	if(pos==0) {
	        		newnode.next=head;
	        		return newnode;
	        	}
				int i=0;
			node_1<Integer>temp=head;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
			return head;
			
	}
	public static  void printlinkedlist(node_1<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				node_1<Integer> node1=new node_1<Integer>(10);
//				node_1<Integer>node2=new node_1<Integer>(20);
//				node_1<Integer>node3=new node_1<Integer>(30);
//				node_1<Integer>node4=new node_1<Integer>(40);
//				node1.next=node2;
//				node2.next=node3;
//				node3.next=node4;
//				node_1<Integer> head= node1;
				
//				node_1<Integer> head=getinput();
				//head=insert(head,238,0);
//				printlinkedlist(head);
				//node_1<Integer> head1=insertopt();
				//printlinkedlist(head);
//				while(head!=null) {
//					System.out.print(head.data+" ");
//					head=head.next;
//				}
				
//				node_1<Integer> head111=head;
//				int count=1;
//				while(head111.next!=null) {
//					count++;
//					head111=head111.next;
//				}
//				System.out.println(head111.data );
//				System.out.print(count );
		   node_1<Integer>head=getinput();
		   printlinkedlist(head);
				
	}

}
