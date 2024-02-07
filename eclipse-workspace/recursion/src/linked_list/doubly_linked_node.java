package linked_list;

public class doubly_linked_node <t>{
	doubly_linked_node<t> perv;
	t data;
	doubly_linked_node<t> next;
	doubly_linked_node(t data){
		perv=null;
		this.data=data;
		next=null;
	}
	
			
}
