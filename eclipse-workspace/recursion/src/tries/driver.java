package tries;



public class driver {

	public static void main(String[] args) {
		Trie t1=new Trie();
		t1.add("news");
		//System.out.println(t1.search("news"));
		//System.out.println(t1.search("newss"));
		t1.delete("news");
	//	System.out.println(t1.search("news"));
		dtrie tt=new dtrie();
		tt.insert("coer");
		System.out.println(tt.search("coer"));
		tt.delete("coerer");
		System.out.println(tt.search("coepr"));
	}

}
