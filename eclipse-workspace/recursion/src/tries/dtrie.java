package tries;

public class dtrie{
    private  triesnode root;
     dtrie(){
     	root =new triesnode('\0');
     }
     
   public void insert(String word) {
 	  insert(root,word);
   }

private void insert(triesnode root, String word) {
		 if(word.length()==0){
			 root.isTerminating=true;
			 return ;
		 }
		  int index=word.charAt(0)-'a';
		 triesnode child=root.children[index];
		 if(child==null){
			 child=new triesnode(word.charAt(0));
			 root.children[index]=child;
			root.childcountt++;
		 }

		insert(child,word.substring(1));
}
	public boolean search(String word) {
		  return search(root,word);
		  
	}

private boolean search(triesnode root, String word){
	 if(word.length()==0){
		 if(root.isTerminating==true) {
			 return true;
		 }else {
			 return false;
		 }
		 
	  }
	  int index=word.charAt(0)-'a';
	   triesnode child=root.children[index];
	   boolean ans=false;
	   if(child!=null) {
		   ans =search(child,word.substring(1));
	   }
		return ans;
	}
public void delete(String word){
	  delete(root,word);
}

private void delete(triesnode root, String word) {
	if(word.length()==0) {
     if(root.isTerminating==true) {
    	 root.isTerminating=false;
    	 return ;
     }
     return ;
	}
	int index=word.charAt(0)-'a';
	
	triesnode child=root.children[index];
	if(child!=null)
   delete(child,word.substring(1));
	
}
public void delete2(String word){
	  delete(root,word);
}
private void delete2(triesnode root, String word) {
	if(word.length()==0) {
     if(root.isTerminating==true) {
    	 root.isTerminating=false;
    	 return ;
     }
     return ;
	}
	int index=word.charAt(0)-'a';
	triesnode child=root.children[index];
    delete(child,word.substring(1));
	if(child.isTerminating==false &&child.childcountt==0) {
		root.children[index]=null;
		child=null;
		root.childcountt--;
	}
}

}



