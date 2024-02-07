package queue;

public class node<t>{
    node<t> next;
    t data;
    public node(t data) {
    	this.data=data;
    	next=null;
    }
}
