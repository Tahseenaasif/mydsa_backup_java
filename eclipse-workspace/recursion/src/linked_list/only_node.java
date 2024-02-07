package linked_list;

public class only_node {
		public static void main(String [] args) {
			Node<Integer> node1=new Node<>(18);
			System.out.println(node1.data);
			System.out.println(node1.next);
			Node<Integer> node2=new  Node<>(20);
			node1.next=node2;
			System.out.println(node1.next);
			System.out.println(node2.data);
			System.out.println(node2.next);
			Node<String> node3=new Node<>("tahseen");
			//node2.next=node3;
			//System.out.println(node3.data);
			System.out.println(node2.next);
}
}
