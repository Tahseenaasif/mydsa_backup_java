package binary_search_tree_class;

public class BinarySearchTrees {
	BinaryTreeNode<Integer> root;
	
	
	public void insert(int data) {
		
		root=inserthepler(data,root);
	}
	public BinaryTreeNode<Integer> inserthepler(int data,BinaryTreeNode<Integer> root)
	 {
		//Implement the insert() function
		if(root==null){
			BinaryTreeNode<Integer> node= new BinaryTreeNode<>(data);
			return node;
		}
		if(data>root.data){
			BinaryTreeNode<Integer> rightside= inserthepler(data,root.right);
			root.right=rightside;
		}else {
				BinaryTreeNode<Integer> leftside =inserthepler(data,root.left);
			  root.left=leftside;
		}
		return root;
	}
	
	public void remove(int data) {
		//Implement the remove() function
		root=deleteheper(data,root);
	}
	public BinaryTreeNode<Integer> deleteheper(int data,BinaryTreeNode<Integer> root) {
		//Implement the remove() function
		  if(root==null){
			  return null;
		  }
			if(data<root.data){
				root.left=deleteheper(data,root.left);
			}else if(data>root.data){
				root.right=deleteheper(data,root.right);
			}else{  
						if(root.left==null){
							 return root.right;
							 
						}else if(root.right==null){
							return root.left;
							}
				root.data=minvalue(root.right);
				root.right=deleteheper( root.data,root.right);
			}
			return root;
	}
		public int minvalue(BinaryTreeNode<Integer> root){
						int minval=root.data;
						while(root.left!=null){
							minval=root.left.data;
							root=root.left;
						}
						return minval;

		} 


	
	
	public void printTree() {
		//Implement the printTree() function
	printhelper(root);
	return;
	}
	
	private void  printhelper(BinaryTreeNode<Integer> root)	{
			
			 if(root==null)
            return ;
   
        System.out.print(root.data+":");
        if(root.left!=null)
           
            System.out.print("L:"+root.left.data+",");
        if(root.right!=null){
      
            System.out.print("R:"+root.right.data);
        }
     
        System.out.println();
        printhelper(root.left);
        printhelper(root.right);
        return;
	}

	public  boolean search(int data){
        return searchHelper(root,data);

    }
    private static boolean searchHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return false;
        if(root.data==data)
            return true;
        else if(root.data>data)
            return searchHelper(root.left,data);
        else 
            return searchHelper(root.right,data);

    }
	

}
