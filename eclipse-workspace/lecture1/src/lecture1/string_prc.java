package lecture1;

public class string_prc {

	public static void main(String[] args) {
		String data = "CODINGNINJA";
		int dl=data.length();
		String Graph[]=new String[dl];
//		    for(int i=0;i<Graph.length;i++) {
//		    	Graph[i]=data.charAt(i);
//		    }
		    String s1="";
            String s2="";
            String s3="";
              for(int i=0;i<dl;i++){
                  s1=s1+data.charAt(i);
                 s2=data.charAt(i)+s1;
                 s3=s3+data.charAt(i);
             
              
              }       
             
              System.out.println(s1);
              System.out.println(s2);
              System.out.println(s1.equals(s2));
              
	}              

}

