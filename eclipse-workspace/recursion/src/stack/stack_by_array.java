package stack;

public class stack_by_array {
    private int data[];
    private int top;
	
     public  stack_by_array() {
    	 data=new int[10];
    	 top=-1;
     }
     public stack_by_array(int capacity){
    	 data=new int[capacity];
    	 top=-1;
     }
     public boolean isemply(){
    	 
		return top==-1;
    	 
     }
     public int size() {
    	 return top+1;
     }
     public int top() throws stackempty{
    	 if(size()==0) {
    		 stackempty e=new stackempty();
    		 throw e;
    	 }
    	 return data[top];
     }
     public void push(int element)throws stackfull{
    	  if(size()==data.length) {
    		  stackfull e=new stackfull();
    		  throw e;
    	  }
    	  top=top+1;
    	  data[top]=element;
     }
     public int pop()throws stackempty{
          if(size()==0){
        	  stackempty e=new stackempty();
        	  throw e;
          }
          int temp=data[top];
          top--;
          return temp;
}
}
