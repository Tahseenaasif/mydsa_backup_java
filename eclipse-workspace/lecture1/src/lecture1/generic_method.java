package lecture1;
class printarray{
	
	
	
}
public class generic_method {
	public static <t> void print(t a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
public static void main(String args[]){
		Integer a[]=new Integer[10];
		for(int i=0;i<10;i++) {
			a[i]=i+1;
		}
		String s[]=new String[10];
		for(int i=0;i<10;i++) {
			s[i]="bbaa";
		}
		print(a);
		print(s);
}
}