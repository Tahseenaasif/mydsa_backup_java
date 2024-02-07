package disjoint_set;

public class union_find {
	int parent[];
	union_find(int n){
		parent=new int[n];
		 for(int i=0;i<parent.length;i++) {
   		  parent[i]=i;
   	  }
	}
		public int find(int x){
			if(parent[x]==x) {
				return x;
			}else {
				return find(parent[x]);
			}
	    }
		
		void union(int x,int y){
			int x_rep=find(x);
			int y_rep=find(y);
			if(x_rep==y_rep) {
				return ;
			}
			parent[y_rep]=x_rep;
		}
}
	
