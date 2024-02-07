package binary_trees;
import java.util.*;
import java.util.Scanner;



 class pairiterative{
	 binarytreenode node;
	 int state;
	 pairiterative(binarytreenode node,int state){
		 this.node=node;
		 this.state=state;
	 }
 }
 
public class binarytreeuse { 
	public static binarytreenode<Integer> removeleaf(binarytreenode<Integer>root){
		if(root==null) {
			return null;
		}
		if(root.left==null &&root.right==null){
			return null;
		}
		root.left= removeleaf(root.left);
		root.right=removeleaf(root.right);
		return root;
	}
	public static  ArrayList<Integer> roottonodepath(binarytreenode<Integer>root){
		if(root==null) {
			ArrayList<Integer> output=new ArrayList<>();
			return output;
		}

		ArrayList<Integer>left=roottonodepath(root.left);

		ArrayList<Integer>right=roottonodepath(root.right);

		if(left.size()>right.size()){
			left.add(root.data);
			
		}else {
			right.add(root.data);
			
		}

		return (left.size() >
        right.size() ? left :right);
	}
	public static boolean iscousins(binarytreenode<Integer> root,int a,int b){
	    int levela=level(root,a,0);
	    int levelb=level(root,b,0);
	      if(levela!=levelb){
	    	  return false;
	      }
	      return secondf(root, a, b);
}
	public static boolean secondf(binarytreenode<Integer>root,int a,int b) {
		if(root==null) {
			return true;
		}
		if(root.left!=null &&root.right!=null) {
		if(root.left.data==a &&root.right.data==b ||root.left.data==b && root.right.data==a) {
				return false;
			}
		}
		 boolean left=secondf(root.left,a,b);
		 if(left==false) {
			 return false;
		 }
		 boolean right=secondf(root.right,a,b);
		 if(right==false) {
			 return false;
		 }
		 return true;
		}
	
	public static  int level(binarytreenode<Integer>root, int  data, int lev)
	    {
	        
	        if (root == null)
	            return 0;
	 
	        if (root.data== data)
	            return lev;
	 
	     
	        int l = level(root.left, data, lev + 1);
	        if (l != 0)
	            return l;
	 
	        return level(root.right, data, lev + 1);
	    }
	
  public static void iterativeprint(binarytreenode<Integer>root) {
	   String pre="";
	   String in="";
	   String post="";
	   Stack<pairiterative> stk=new Stack<>();
	   pairiterative p=new pairiterative(root,1);
	   stk.push(p);
	   while(stk.size()>0) {
		   pairiterative top=stk.peek();
		   if(top.state==1){
			     pre+=top.node.data+" ";
			     top.state++;
			     if(top.node.left!=null){
			    	 pairiterative left=new pairiterative(top.node.left,1);
			    	 stk.push(left);
			    	 
			     }
		   }else if(top.state==2) {
			        in+=top.node.data+" ";
			        top.state++;
			        if(top.node.right!=null){
			        	pairiterative right=new pairiterative(top.node.right,1);
			        	stk.push(right);
			        }
		   }else {
			   post+=top.node.data+" ";
			   stk.pop();
	     }
	}
	   System.out.println("pre order traversal:- "+pre);
	   System.out.println("in order traversal:- "+in);
	   System.out.println("post order traversal:- "+post);
  }
	public static int maximum(binarytreenode<Integer>root) {
		  if(root==null) {
			  return 0;
		  } 
		  int max=root.data;
		  int lans=maximum(root.left);
		  int rans=maximum(root.right);
		  if(lans>max){
			  max=lans;
		  }
		  if(rans>max) {
			  max=rans;
		  }
		  return max;
	}
	
	public static isBstPair isbst(binarytreenode<Integer> root){
		if(root==null){
			isBstPair bp=new isBstPair();
			bp.isbst=true;
			bp.max=Integer.MIN_VALUE;
			 bp.min=Integer.MAX_VALUE;
		}
		isBstPair lside= isbst(root.left);
		isBstPair rside= isbst(root.right);
		
		isBstPair res=new isBstPair();
		res.isbst=lside.isbst && rside.isbst &&(root.data>=lside.max && root.data <=rside.min);
		res.max=Math.max(root.data, Math.max(lside.max, rside.max));
		res.min=Math.min(root.data,Math.min(lside.min, rside.min));
		return res;
	}
	
	public  static ArrayList<binarytreenode<Integer>> pathlist=new ArrayList<>();
	public static boolean  path1(binarytreenode<Integer> root,int data ){
		if(root==null){
			return false ;
		}
		if(root.data==data){
			pathlist.add(root);
			return true;
		}
		  boolean flic=path1(root.left,data);  
		  if(flic){
			  pathlist.add(root);
			  return true;
		  }
		  boolean flicc=path1(root.right,data);
		  if(flicc){
			  pathlist.add(root);
			  return true;
		  }
		return false;
}
	
	public static ArrayList<Integer> path(binarytreenode<Integer> root,int data){
		if(root==null) {
			return null;
		}
		if(root.data==data){
			ArrayList<Integer> output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> loutput=path(root.left,data);
		if(loutput!=null) {
		   loutput.add(root.data);
		   return loutput;
		}
		ArrayList<Integer> routput=path(root.right,data);
		if(routput!=null) {
		   routput.add(root.data);
		   return routput;
		}
//		}else {
//			return null;
//		}
		return null;
	}
	public static  deameterreturn diameteropt(binarytreenode<Integer>root){
		if(root==null) {
			int height=0;
			int diameter=0;
			deameterreturn ans=new deameterreturn();
			ans.height=0;
			ans.diameter=0;
			return ans;
		}
		deameterreturn left=diameteropt(root.left);
		deameterreturn right=diameteropt(root.right);
		int height=1+Math.max(left.height,right.height);
//		int diamreal=0;
//		diamreal=left.height+right.height;
//		diamreal=Math.max(left.diameter, right.diameter);
		int opt1=left.height+right.height;
		int opt2=left.diameter;
		int opt3=right.diameter;
		int res=Math.max(opt1,Math.max(opt2,opt3));
		
		deameterreturn ans=new deameterreturn ();
		ans.height=height;
		ans.diameter=res;
		return ans;
		
		
		
		
	}
	public static int diameter(binarytreenode<Integer>root ){
		 if(root==null) {
			return 0;
		}
		

		  int opt1=height(root.left)+height(root.right)+1;
		  int opt2=diameter(root.left);
		  int opt3=diameter(root.right);
		  return Math.max(opt1,Math.max(opt2, opt3) );
		  
//		  int diam1=diameter(root.left);
//		  int diam2=diameter(root.right);
////		  return Math.max(diam1,diam2);
		  
	}
	public static balancetreereturn isbalanceopt(binarytreenode<Integer>root){
		if(root==null) {
			int height=0;
			boolean isbalance=true;
			balancetreereturn  ans=new balancetreereturn();
			ans.height=0;
			ans.isbalance=true;
			return ans;
		}
		balancetreereturn leftnode=isbalanceopt(root.left);
		balancetreereturn rightnode=isbalanceopt(root.right);
		int height=Math.max(leftnode.height,rightnode.height)+1;
		boolean isbal=true;
		 if(Math.abs(leftnode.height-rightnode.height)>1) {
			 isbal=false;
		 }
		 if(!leftnode.isbalance  ||!rightnode.isbalance) {
			 isbal =false;
		 }
		 balancetreereturn ans=new balancetreereturn();
		 ans.height=height;
		 ans.isbalance=isbal;
		 return ans;
		
	}
	public  static  boolean isblance(binarytreenode<Integer>root ){
		if(root==null){
			return true;
		} 
		  boolean ans=true;
		int  ans1=height(root.left);
	    int   ans2=height(root.right);
	      if(Math.abs(ans1-ans2)>1) {
	    	  return false;
	      }
//	      ans=isblance(root);
//	      if(ans==false) {
//		    	return false;
//		    }
	   boolean  ansl= isblance(root.left );
//	    if(ans==false) {
//	    	return false;
//	    }
	   boolean ansr=isblance(root.right);
//	    if(ans==false) {
//	    	return false;
//	    }
	    return ansr && ansl;
	}
	
	
	public static int height(binarytreenode<Integer> root){
		  if(root==null) {
			  return 0;
		  }
		  return Math.max(height(root.left),height(root.right))+1;
	}
	
	
	public static binarytreenode<Integer> removeleafnode(binarytreenode<Integer>root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null){
			return null;
		}
		
		root.left= removeleafnode(root.left);
		root.right=removeleafnode(root.right);
		
		return root;
		
	}
	public static void printatk(binarytreenode<Integer>root,int k) {
		  if(root==null){
			    return;
		  }
		  if(k==0){
			System.out.println(root.data);  
		  }
		  printatk(root.left,k-1);
		  printatk(root.right,k-1);
	}
	public static binarytreenode<Integer> takeinputiteratively(Scanner sc) {
		int rootele;
		System.out.println("please enter the root");
		 rootele=sc.nextInt();
		 
		 binarytreenode<Integer> root=new binarytreenode<Integer>(rootele);
		Queue<binarytreenode<Integer>> pqueue=new LinkedList<>();
		pqueue.add(root);
		
		while(!pqueue.isEmpty()){
			binarytreenode<Integer> frontnode=pqueue.remove();
			System.out.println("please enter the left node data of : "+frontnode.data);
			int leftdata=sc.nextInt();
			if(leftdata!=-1) {
				 binarytreenode<Integer> left=new binarytreenode<Integer>(leftdata);
				 frontnode.left=left;
				 pqueue.add(left);
			}
		
			System.out.println("please enter the right node data of : "+frontnode.data);
			int rightdata=sc.nextInt();
			if(rightdata!=-1) {
				 binarytreenode<Integer> right=new binarytreenode<Integer>(rightdata);
				 frontnode.right=right;
				 pqueue.add(right);
			}
		
		
	}
		return root;
		
		
	}
	public static void print(binarytreenode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 String res=root.data+"";
		 if(root.left != null) {
			res+="L:"+root.left.data+",";
		 }
		 if(root.right!=null) {
			 res+="R:"+root.right.data+",";
		 }
		 System.out.println(res);
		print(root.left);
		print(root.right);
	}
    public static binarytreenode<Integer> takeinput(Scanner sc) {
    	int n;
    	System.out.println("please enter the root ");
    	   n=sc.nextInt();
    	 if(n==-1) {
    		return null;
    	 }
    	binarytreenode<Integer> root=new binarytreenode<Integer>(n);
    	root.left=takeinput(sc);
    	root.right=takeinput(sc);
    	 return root;
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc=new Scanner(System.in);
		
		binarytreenode<Integer> root=takeinputiteratively(sc);
		//binarytreenode<Integer> root=takeinput( sc);
		print(root);
	//	printatk(root,2);
		//binarytreenode<Integer> roott= removeleafnode(root);
	//	print(roott);
//		boolean ans=isblance(root);
//		System.out.println(ans);
//		balancetreereturn ans2=isbalanceopt(root);
//		System.out.println(ans2.isbalance+" "+ans2.height);
//		System.out.println(diameter(root));
//		deameterreturn diam=diameteropt(root);
//		System.out.println(diam.diameter);
//		ArrayList<Integer> rasta1=path(root,14);
//		ArrayList<Integer> rasta2=path(root,15);
//		  path(root,14);
//		  path(root,15);
		  //path1(root,);
//		System.out.println(rasta1);
//		System.out.println(rasta2);
//		for(int i=0;i<pathlist.size();i++) {
//		System.out.println(pathlist.get(i).data);
//		}
//		   isBstPair ans=isbst(root);
//		   System.out.println(ans.isbst+" "+ans.max+" "+ans.min);
		//System.out.println(maximum(root));
		//iterativeprint(root);
		System.out.println("the path fron root to node:-  "+roottonodepath(root));
//		System.out.println(iscousins(root,10,4));
//		System.out.println(secondf(root,10,4));
//		System.out.println(level(root,10,0));
//		System.out.println(level(root,4,0));
		binarytreenode<Integer>root1=removeleaf(root);
		print(root1);
	}

}
