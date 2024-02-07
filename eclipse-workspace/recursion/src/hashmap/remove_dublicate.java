package hashmap;
import java.util.*;
public class remove_dublicate {
        public static ArrayList<Integer> remove_Dublicate(int a[]){
        	ArrayList<Integer> output=new ArrayList<Integer>();
          HashMap<Integer,Boolean> seen=new HashMap<>();
           for(int i=0;i<a.length;i++) {
        	   if(seen.containsKey(a[i])) {
        		   continue;
        	   }
        	   seen.put(a[i], true);
        	  output.add(a[i]);
           }
           return output;
        }
        public static void main(String[] args){
        	int[] data= {1,2,3,4,1,4,5,2,3,1,5,7,8,97,6,5,4,3,66,75,5,1,1};
        	ArrayList<Integer>output=remove_Dublicate(data);
        	System.out.println(output);
        	
        	
    }
}