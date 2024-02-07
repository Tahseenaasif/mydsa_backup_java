package stack;

public class stack_dynamic {
	private int data[];
    private int top;
	
     public stack_dynamic() {
    	 data=new int[10];
    	 top=-1;
     }
     public stack_dynamic(int capacity){
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
//    		  stackfull e=new stackfull();
//    		  throw e;
    		  int temparr[]=data;
    		  
    		  data=new int[2*temparr.length];
    		  for(int i=0;i<temparr.length;i++){
    			  data[i]=temparr[i];
    		  }
    		  
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

	

