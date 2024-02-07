package trees;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class treeuse { 
	
	public static  treeNode<Integer> takeinput(){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the next node data");
		   n=sc.nextInt();
		treeNode<Integer> root=new treeNode<Integer>(n);
		System.out.println("please enter no of children "+n);
		int childcount=sc.nextInt();
		for(int i=0;i<childcount;i++){
			treeNode<Integer>child=takeinput();
			root.children.add(child);
		}
		return root;
		
	}
	
	public static void print(treeNode<Integer> root){
	String s=root.data+":" ;
	for(int i=0;i<root.children.size();i++) {
		s=s+root.children.get(i).data+",";
	}
	
	System.out.println(s);
	for(int i=0;i<root.children.size();i++) {
		print(root.children.get(i));
	}
	}
	public static treeNode<Integer> newinput(Scanner sc){
		int n;
		System.out.println("please enter the next data");
		n=sc.nextInt();
		treeNode<Integer> root=new treeNode<Integer>(n);
		
		System.out.println("please enter the no of chlildren for : "+n);
		int childcount=sc.nextInt();
		for(int i=0;i<childcount;i++) {
			treeNode<Integer> child=newinput(sc);
			  root.children.add(child);
		}
		return root; 
		
	}
	public static treeNode<Integer> insertlevelwise(){
		Scanner sc=new Scanner (System.in);
		System.out.println("please enter the root data");
		int rootdata=sc.nextInt();
		Queue<treeNode<Integer>> pendingnode=new LinkedList<>();
		treeNode<Integer> root=new treeNode<Integer>(rootdata);
		pendingnode.add(root);
		 while(!pendingnode.isEmpty()){
			 
			 treeNode<Integer> frontNode=pendingnode.remove();
			 System.out.println("Enter num of children of " + frontNode.data);
			 int childcount=sc.nextInt();
			 for(int i=0;i<childcount;i++){
				 
				 System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
				 int child=sc.nextInt();
				 treeNode<Integer> childNode=new treeNode<>(child);
				 frontNode.children.add(childNode);
				 pendingnode.add(childNode);
				 
			 }
			 
		 }
		 return root;
		  
	}
	
	public static void  printlevelwise(treeNode<Integer> root) {
//		    int data=root.data;
//		    //System.out.print(data+" ");
//		     treeNode<Integer>rootnew=root;
//		    Queue<treeNode<Integer>>pendingqueue=new LinkedList<>();
//		    pendingqueue.add(rootnew);
//		    pendingqueue.add(null);
//		   // System.out.println(data);
//		    while(! pendingqueue.isEmpty()){
//		    	
//		    }
//		 Queue<treeNode<Integer>>q1=new LinkedList<>();
//		 q1.add(root);
//		 while(q1.isEmpty()) {
//			 treeNode<Integer> temp=q1.remove();
//			 System.out.print(temp.data+" ");
//			 for(int i=0;i<temp.children.size();i++){
//				 System.out.print(temp.children.get(i).data+" "); 
//				 	q1.add(temp.children.get(i));
//			 }
//			 System.out.println();
//		 }
       Queue<treeNode<Integer>>q1=new LinkedList<>();
       Queue<treeNode<Integer>>q2=new LinkedList<>();
       q1.add(root);
       while(q1.size()>0){
    	   treeNode<Integer> temp =q1.remove();
    	   System.out.println(temp.data);
    	   for(int i=0;i<temp.children.size();i++){
    		   		q2.add(temp.children.get(i));
    	   }
    	   		if(q1.size()==0){
    	   			while(q2.isEmpty()) {
    	   				q1.add(q2.remove());
    	   			}
    	   			
    	   			System.out.println();
    	   		}
    	   
    	   
    	   
       }
		    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				treeNode<Integer> root=new treeNode<>(20);
//				treeNode<Integer> child1=new treeNode<>(1);
//				treeNode<Integer> child2=new treeNode<>(3);
//				treeNode<Integer> child3=new treeNode<>(4);
//				treeNode<Integer> child4=new treeNode<>(5);
//				treeNode<Integer> child6=new treeNode<>(6);
//				treeNode<Integer> child7=new treeNode<>(7);
//				root.children.add(child2);
//				root.children.add(child3);
//				root.children.add(child4);
//				child1.children.add(child6);
//				child2.children.add(child7);
//		Scanner s=new Scanner(System.in);
//		treeNode<Integer> root=newinput(s);
//		treeNode<Integer> root=takeinput();
		treeNode<Integer>root =null;
			try {
				 root=insertlevelwise();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	//	print(root);
		printlevelwise(root);
	}

}