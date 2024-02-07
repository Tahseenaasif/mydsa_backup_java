package linked_list;

public class circular_double_link<t> {
			
	circular_double_link<t> perv;
	t data;
	circular_double_link<t> next;
	
	circular_double_link(t data){
		perv=null;
		this.data=data;
		next=null;
	}
}
