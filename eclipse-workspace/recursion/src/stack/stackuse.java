package stack;

public class stackuse {
	public static void main(String args[])throws stackfull, stackempty {
		stack_by_array stk1=new stack_by_array(50);
	 for(int i=0;i<19;i++) {
		 stk1.push(i);
	 }
	 int size=stk1.size();
	 System.out.println("the size of the stack is :- "+size);
	 for(int i=0;i<19;i++) {
		 int elem=stk1.pop();
		 System.out.print(elem+" ");
	 }
	 int siz2=stk1.size();
	 System.out.println();
	 System.out.println("the size of the stack is :- "+siz2);
	 
	
	stack_dynamic stk2=new stack_dynamic();
	for(int i=0;i<1000;i++) {
		 stk2.push(i);
	 }
	int size_1=stk2.size();
	 System.out.println("the size of the stack is :- "+size_1);
	 for(int i=0;i<1000;i++) {
		 int elem=stk2.pop();
		 System.out.print(elem+" ");
	 }
	 int siz3=stk2.size();
	 System.out.println();
	 System.out.println("the size of the stack is :- "+siz3);
	 
	}
}

