package disjoint_set;

public class union_by_rank_and_path_compression {
      int parent[];
      int rank[];
      union_by_rank_and_path_compression(int n){
    	  parent=new int[n];
    	  rank=new int[n];
    	  for(int i=0;i<n;i++) {
    		  parent[i]=i;
    	  }
      }
      
      public int findopt(int x){
    	  if(parent[x]==x) {
    		  return x;
    	  }
    	  parent[x]=findopt(parent[x]);
    	  return parent[x];
      }
      public void unionopt(int x,int y) {
    	  int x_rep=findopt(x);
    	  int y_rep=findopt(y);
    	  if(x_rep==y_rep) {
    		  return;
    	  }else if(rank[x_rep]<rank[y_rep]) {
    		  parent[x_rep]=y_rep;
    	  }else if(rank[x_rep]>rank[y_rep]) {
    		  parent[y_rep]=x_rep;
    	  }else {
    		  parent[y_rep]=x_rep;
    		  rank[x_rep]++;
    	  }
      }

}
