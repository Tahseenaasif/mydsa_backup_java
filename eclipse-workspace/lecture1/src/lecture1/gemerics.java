package lecture1;
 
public class gemerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen<Integer,String > p=new <Integer,String> gen(1,"tahseen");
		System.out.println(p.getsecond());
		gen<Integer,Integer>pp=new gen<>(28,33);
		gen<gen<Integer,Integer>,String > p2=new gen<> (pp,"aasif");
		System.out.println(p2.getsecond());
		System.out.println(p2.getfirst().getfirst());
		System.out.println(p2.getfirst().getsecond());
	}

}
