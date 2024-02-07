package stack;

import linked_list.Node;

public class using_linked_list {
     private stack_node<Integer> head;
     private int  size;
  using_linked_list(){
	  head=null;
	  size=0;
	  //size=0;
  }
  
  public void push(int element) {
	  stack_node<Integer> newnode=new  stack_node<Integer>(element);;
	  if(head==null) {
		  head=newnode;
		  size++;
	  }else {
		  newnode.next=head;
		  head=newnode;
		  size++;
	  }
  }
	  public int pop() throws stackempty{
		  if(head==null) {
			  size--;
			  stackempty e=new stackempty();
			  throw e;
		  }
		  int temp=head.data;
		  if(head.next==null) {
			  size--;
			  head=null;
			  return temp;
		  }
		  size--;
		  head=head.next;
		  return temp;
	  }
	  public int top() {
		  return head.data;
	  }
	  public boolean isempty() {
		  return head==null;
	  }
	  public int size() {
		  return size;
	  }
  }

