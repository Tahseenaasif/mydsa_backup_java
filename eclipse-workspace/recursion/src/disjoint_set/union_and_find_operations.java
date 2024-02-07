package disjoint_set;

public class union_and_find_operations {
          
          
          
	public static void main(String[] args) {
		union_find obj=new union_find(5); 
		obj.union(0,1);
		obj.union(1,4);
              System.out.println(obj.find(4));
    union_by_rank_and_path_compression ob1=new union_by_rank_and_path_compression(5);
             ob1.unionopt(1,4); 
             System.out.println(ob1.findopt(4));
	}

}
