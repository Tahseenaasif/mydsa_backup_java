package trees;
import java.util.*;

public class treeNode<t> {
	 public t data;
	 public ArrayList<treeNode<t>> children ;

	 public treeNode(t data){
		 this.data=data;
		 this.children=new ArrayList<>();
		 
	 }

}
