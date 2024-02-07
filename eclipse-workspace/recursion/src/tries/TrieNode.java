package tries;
import java.util.*;

 class TrieNode {
     char data;
     boolean isterminating;
     TrieNode children[];
     int childcount;
     TrieNode(char data){
    	 this.data=data;
    	 this.isterminating=false;
    	 children=new TrieNode[26];
    	 childcount=0;
     }
}
 class Trie{
    	private static TrieNode root;
    	 Trie(){
    		 root=new TrieNode('\0');
    		 }
     private static void add(TrieNode root,String word){
    	 if(word.length()==0) {
    		 root.isterminating=true;
    		 return;
    	 }
    	 int childindex=word.charAt(0)-'a';
    	 TrieNode child=root.children[childindex];
    	 if(child==null) {
    		 child=new TrieNode(word.charAt(0));
    		 root.children[childindex]=child;
    		 root.childcount++;
    	 }
    	 add(child,word.substring(1));
     }
     public static void add(String word) {
    	 add(root,word);
     }
    	 
    private static boolean search(TrieNode root,String word){
        if(word.length()==0){
    		 if(root.isterminating==true){
    			 return true;
    		 }
    		 return false;
    	 }
    	 int index=word.charAt(0)-'a';
    	  TrieNode child=root.children[index];
    	  boolean ans=false;
    	   if(child!=null){
    		ans= search( child,word.substring(1));
    	 }
    		 
    	 return ans;
    	 
     }
    	public static boolean search(String word){
    		return search(root,word);
    	}
    	public void delete(TrieNode root,String word){
    		if(word.length()==0) {
    			if(root.isterminating==true) {
    				root.isterminating=false;
    				
    			}
    			return;
    		}
    		
    	  int index=word.charAt(0)-'a';
      	  TrieNode child=root.children[index];
      	   if(child==null){
      		return;
      	 }
      	 delete( child,word.substring(1)); 
    	}
    	public void delete1(String word){
    		delete(root,word);
    	}
    	
   
    public void delete1(TrieNode root,String word){
    		if(word.length()==0) {
    			if(root.isterminating==true) {
    				root.isterminating=false;
    				
    			}
    			return;
    		}
    		
    	  int index=word.charAt(0)-'a';
      	  TrieNode child=root.children[index];
      	   if(child==null){
      		return;
      	 }
      	 delete1( child,word.substring(1));
      	if(!child.isterminating && child.childcount==0){
      		 root.children[index]=null;
			 child=null;
			 root.childcount--;
      	}
      	
//      	 if(!child.isterminating) {
//      		 int numchild=0;
//      		 for(int i=0;i<26;i++){
//      			 if(child.children[i]!=null) {
//      				 numchild++;
//      			 }
//      		 }
//      		 if(numchild==0) {
//      			 root.children[index]=null;
//      			 child=null;
//      			 root.childcount--;
//      		 }
//      	 }
    	}
    	public void delete(String word){
    		delete1(root,word);
    	}
    	public boolean patternMatching(ArrayList<String> vect, String pattern){
            for(int i=0;i<vect.size();i++) {
				   if(vect.get(i)!=" "){
				   String cst= vect.get(i);
				   	while(cst.length()!=0){
						   add(cst);
						   cst=cst.substring(1);
					   }
			   }
			   }
			   return search(pattern);
		
	}
     
}
    

