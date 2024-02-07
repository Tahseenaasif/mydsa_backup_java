package segment_tree;

public class construct {
       public static  int tree[];
       construct(int input[],int n){
    	   //tree=new int[4*n];
    	        //or
    	   int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));
    	   int max_size = 2 * (int) Math.pow(2, x) - 1;
    	   tree=new int[max_size];
    	   constructSt(input,0,n-1,0);
       }
         
      public static int constructSt(int input[],int ss,int se,int si){
        	  if(ss==se){
        		  tree[si]=input[ss];
        		  return input[ss];
        	  }  
        	  int mid=ss+se/2;
        	  tree[si]=constructSt(input,ss,mid,2*si+1)+constructSt(input,ss,mid,2*si+2);
        	  return tree[si];
          }
      int getSumUtil(int ss, int se, int qs, int qe, int si)
      {
          if (qs <= ss && qe >= se)
              return tree[si];
   
          if (se < qs || ss > qe)
              return 0;
   
          
          int mid = (ss + se)/2;
          return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
                  getSumUtil(mid + 1, se, qs, qe, 2 * si + 2);
      }
      void updateValueUtil(int ss, int se, int i, int diff, int si)
      {   
          if (i < ss || i > se)
              return;
          tree[si] = tree[si] + diff;
          if (se != ss) {
              int mid =(ss+se)/2;
              updateValueUtil(ss, mid, i, diff, 2 * si + 1);
              updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
          }
      }
//       public static void main (String args[]) {
//    	      int  input[]= {10,20,30,40};
//    	      
//       }
       
}
