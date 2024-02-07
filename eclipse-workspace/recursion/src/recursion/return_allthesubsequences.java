package recursion;


public class return_allthesubsequences {
  /*  public static String[] allsubstrings(String str ) {
    	if(str.length()==0) {
    		String ans[]={""};
    				return ans;
    	}
    	
    	String smallans[]=allsubstrings(str.substring(1));
    	
    	String ans[]=new String[2*smallans.length];
    	for(int i=0;i<smallans.length;i++) {
    		ans[i]=smallans[i];
    	}
    	for(int i=0;i<smallans.length;i++) {
    		ans[i+smallans.length]=str.charAt(0)+smallans[i];
    	}
    	return ans;
    }*/
	 public static void allsubstrings(String str ) {
		 
	
	    	printallsubsequceces(str,"");
	    	
	   
	    }
	 
	 public static void printallsubsequceces(String str,String outputsofar) {
		 if(str.length()==0) {
			 System.out.println(outputsofar);
			 return;
		 }
		 printallsubsequceces(str.substring(1),outputsofar);
		 printallsubsequceces(str.substring(1),outputsofar+str.charAt(0));
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String sss="abc";
			/*String[] ans=allsubstrings(sss);
			for(int i=0;i<ans.length;i++) {
	    		System.out.println(ans[i]);
	    	}*/
			allsubstrings(sss);
	}

}
