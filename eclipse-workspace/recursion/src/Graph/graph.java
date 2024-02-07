package Graph;

import java.util.*;

public class graph {
	private static void printhelper2(int[][] edges, boolean[] visited2,int ste){
//		System.out.print(ste+" ");
//		for(int i=0;i<edges.length;i++) {
//			if(!visited2[i] && edges[ste][i]==1) {
//			System.out.print(i+" ");
//			}
//		}
		for(int i=0;i<edges.length;i++){
			if(!visited2[i] && edges[ste][i]==1){
				System.out.print(i+" ");
				visited2[i]=true;
		}
		}
		
		visited2[ste]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[ste][i]==1 && !visited2[i]) {
				printhelper2(edges,visited2,i);
			}
			
		}
		
	}
	public static void print(int edges[][]) {
		boolean visited[]=new boolean[edges.length];
		boolean visited2[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++){
			if(!visited[i]) {
	   //	printhelper(edges,visited,i);
	   printhelper2(edges,visited2,i);
		 }
		}
	}

	private static void printhelper(int[][] edges, boolean[] visited,int ste) {
		System.out.print(ste+" ");
		visited[ste]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[ste][i]==1 && !visited[i]) {
				printhelper(edges,visited,i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the no of verices");	
	         int v=sc.nextInt()	;
	         
	    System.out.println("please enter the no of edges");	
	         int e=sc.nextInt();
	         
	         int edges[][]=new int[v][v];
	         for(int i=0;i<e;i++) {
	        	 int fe=sc.nextInt();
	        	 int se=sc.nextInt();
	        	 edges[fe][se]=1;
	        	 edges[se][fe]=1;
	        		 
	        	 }
	           print(edges);
	         }
	

}