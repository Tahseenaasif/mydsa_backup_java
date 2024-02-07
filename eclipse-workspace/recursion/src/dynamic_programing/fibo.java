package dynamic_programing;

public class fibo {
	public static int fibdpit(int n) {
		int storage[]=new int [n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2;i<=n;i++){
			storage[i]=storage[i-1]+storage[i-2];
		}
		return storage[n];
	}
     public static int fibn(int n) {
    	 if(n<2) {
    		 return n;
    	 }
    	 return fibn(n-1)+fibn(n-2);
     }
     public static int fibdp(int n) {
    	 int storage[]=new int[n+1];
    	 for(int i=0;i<=n;i++){
    		 storage[i]=-1;
    	 }
    	 return fibdp(n,storage);
    	 
     }
	private static int fibdp(int n, int[] storage){
		if(n<2) {
   		 storage[n]=n;
   		 return storage[n];
   	 }
		if(storage[n]!=-1) {
			return storage[n];
		}
   	storage[n]= fibn(n-1)+fibn(n-2);
   	return storage[n];
	}
	public static void main(String[] args) {
		System.out.println(fibdpit(40));
		System.out.println(fibdp(40));
		System.out.println(fibn(40));
		

	}

}
