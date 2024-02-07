package lecture1;
import java.util.*;
class per{
	public int combb(int n) {
		 int ress=1;
		for(int i=1;i<=n;i++) {
			 ress=ress*i;
		}
		return ress;
		
	}
	public boolean isprime(int n) {
		 int ress=1;
		for(int i=2;i<n;i++) {
			 if(n%i==0)
			 return false;
		}
		return true;
		
	}
}
public class fin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*System.out.println("pleaase enter the n value");
		int n=sc.nextInt();
		System.out.println("pleaase enter the n value");
		int r=sc.nextInt();
		per obj=new per();
		int nfact=obj.combb(n);
		int rfact=obj.combb(r);
		int nrrfact=obj.combb(n-r);
		int rees=nfact/(rfact*nrrfact);
		System.out.println(rees);*/
		System.out.println("pleaase enter the n value");
		int n=sc.nextInt();
		per obj=new per();
		System.out.println(obj.isprime(n));
	}

}
