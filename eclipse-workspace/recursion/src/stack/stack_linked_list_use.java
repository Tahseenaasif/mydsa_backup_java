package stack;

public class stack_linked_list_use {
   public static void main(String arg[]) throws stackempty {
	   using_linked_list stk1=new using_linked_list();
	   for(int i=0;i<10;i++) {
		   stk1.push(i);
	   }
	   System.out.println(stk1.size());
	   for(int i=0;i<10;i++){
		   int k=stk1.pop();
		   System.out.print(k+" ");
	   }
	   System.out.println(stk1.isempty());
	   System.out.println(stk1.size());
	   //System.out.print(stk1.top()+" ");
   }
}
