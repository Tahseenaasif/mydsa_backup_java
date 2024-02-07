package lecture1;
import java.util.*;

public class helloworld {
	public static void main(String args[]) {
		/*System.out.println("hello world");
		Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		String s=sc.next();
		System.out.println(s);
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.next();
		System.out.print(a);
		System.out.println(str);
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();
		System.out.print(str + " " + a);
		
		Scanner sc=new Scanner(System.in);
        String name=sc.next();
		int m1=sc.Int();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int average=(m1+m2+m3)/3;
		System.out.println(name);
			System.out.println(average);
		byte b = 50;
		int c =(int )b * 50;
		System.out.println(b);
	    double a = 6 / 4;
        int b  = 6 / 4;
        double c = a + b;
        System.out.println(c);
		double a = 55.5;
        int b = 55;
        a = a % 10;
        b = b % 10;
        System.out.println(a + " "  + b);
		int a=50;
		if(a>10)
		{
		    System.out.print("Coding");
		}
		else(a>20)
		{
		    System.out.print("Ninjas");
		}
		 int x = 15;
		    if(x <= 15){
		        System.out.print("Inside if  ");
		    }else if(x == 15){
		        System.out.print("Inside else if  ");
		    }
		    System.out.println(x);
		   int var1 = 5; 
	        int var2 = 6;
	        if ((var2 = 1) == var1)
	            System.out.print(var2);
	        else 
	            System.out.print(var2 + 1);
		  int a=50;
		    int b=5;
		    if(a/0==b)
		    {

		        System.out.println("Hello");
		    }
		    else
		    {
		        System.out.println("Hi");
		    }
		 int i=0;
		   while(i<10)
		   {
		       i=i+1;
		       System.out.print(i);
		       i=i+1;
		   }
		 int x=5;
		    int y=5;
		    while(x!=y)
		    {
		        System.out.println("Hello");
		        x++;
		        y++;
		    }
		int i=10;
	    while((i=i-1)>0)
	    {
	        System.out.print(i);
	        if(i%5==0)
	            return;
	    }
	     int a = 10;
	     System.out.println(a);
	       // if(a > 5) {
	            //int b= 100;
	            
	       // }
	        //System.out.println(a);
	    }
		Scanner sc=new Scanner (System.in);
		int S=sc.nextInt();
		int E=sc.nextInt();
		int W=sc.nextInt();	
		int f=0;	
		for(int i=S;i<=E;i=i+W){
			 f = ((i - 32) * 5) / 9;
			System.out.println(i+" -"+f);
			}
Scanner sc= new Scanner(System.in);
		
		int S = sc.nextInt(); // start point of Fahrenheit
		int E = sc.nextInt(); // end point of Fahrenheit
		int W = sc.nextInt();// jump or gap
		int c;
		while (S<=E) {
			c = 5 * (S-32)/9;
			System.out.print(S);
			System.out.print(" ");
			System.out.println(c);
			S=S+W;
		}
		
	  	Scanner sc=new Scanner (System.in);
	int S=sc.nextInt();
	int E=sc.nextInt();
	int W=sc.nextInt();	
	int c;	
	for(int i=S;i<=E;i=i+W){
		c = 5 * (i-32)/9;
		System.out.println(i+" -"+c);
	}
Scanner sc= new Scanner(System.in);
		
		int S = sc.nextInt(); // start point of Fahrenheit
		int E = sc.nextInt(); // end point of Fahrenheit
		int W = sc.nextInt();// jump or gap
		int c;
		while (S<=E) {
			c = 5 * (S-32)/9;
			
			System.out.println(S+"-"+c);
			S=S+W;
		}
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		char grade=sc.next().charAt(0);
		int hra=(salary*20)/100;
		int da=(salary*50)/100;
		int pf=(salary*11)/100;
		if(grade=='A'){
			int tatalSalary=salary+hra+da+1700-pf;
			System.out.println( tatalSalary);
		}else if(grade=='B'){
			int tatalSalary=salary+hra+da+1500-pf;
			System.out.println( tatalSalary);
		}else{
			int tatalSalary=salary+hra+da+1300-pf;
			System.out.println( tatalSalary);
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("i");
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <=i; j++) {
				System.out.print((char)('A'+n+j-i-1));
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <=n-i+1; j++) {
				System.out.print(n-i+1);
			}
			for (int j =1 ; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=i; j++) {
				System.out.print(j);
			}
			     int k=i-1;
			for (int j =1; j <i; j++) {
				System.out.print(k);
				k--;
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=i+i-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= n; i++) {
			for (int j =1 ; j <=n-i; j++) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=i; j++) {
				System.out.print(i+j-1);
			}
			for (int j =i ; j >1; j--) {
				System.out.print(i+j-2);
			}
			System.out.println(" ");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//65
		for (int i = 1; i <= (n/2)+1; i++){
			for (int j =1 ; j <=((n/2)+1)-i; j++) {
				System.out.print(" ");
			}
			for (int j =1 ; j <=i+i-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	
		for (int i = (n/2); i >=1; i--){
			for (int j =1 ; j <=((n/2)+1)-i; j++) {
				System.out.print(" ");
			}
			for (int j =i+i-1 ; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}/*for(int i=(n/2)+1;i>1;i--) {
		for(int j=(n/2)+1;j>=i;j--) {
		System.out.print(" ");
	} 
	int k=(n/2)+1;
	for(int j=(n/2)+1;j>=k;j--) {
		if(k>=1) {
		System.out.print("*");
		}
		
		
	}
	k=k-2;
	System.out.println(" ");
}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 65
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=n; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("i");
			}
			System.out.println(" ");
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=n-i+1;j++){
				System.out.print(i+k-1);
				k=k+2;
			}      
			   int l=0;
			for(int j=1;j<i;j++){
				System.out.print(j+l);
				l=l+1;
			}
			System.out.println(" ");
	       }
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int pos=i;
			for(int j=1;j<=n+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum1=0;
			for(int j=1;j<=i;j++) {
				sum1=sum1+j;
				
				System.out.print(j);
				if(j<i) {
					System.out.print("+");
				}else if(j==i){
					System.out.print("=");
				}
			}
			System.out.print(sum1);
			System.out.println(" ");
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n+1;i++) {
		  for(int j=1;j<=i;j++) {
			 if(j==1||j==i) {
				System.out.print("*");
							}
			if(j!=1&j!=i) {
		    System.out.print(j);
			}
			System.out.println(" ");
		}
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int firstHalf = n + 1;
	    int secondHalf = n;
	    int i = 1;
	    System.out.println("*");
	    while (i < firstHalf) {
	    	System.out.print("*");
	    	int j = 1;
	    	while (j <= i) {
	    		System.out.print(j);
	    		j = j + 1;
	    	}
	    	int k = i - 1;
	    	while(k >= 1) {
	    		System.out.print(k);
	    		k = k - 1;
	       }
	    	System.out.print("*");
	    	System.out.println();
	    	i = i + 1;
	    }
	    i = secondHalf;
	    while(i > 1) {
	    	System.out.print("*");
	        int j = 1;
	        while(j < i) {
	        	System.out.print(j);
	            j = j + 1;
	        }
	        int k = i - 2;
	    	while(k >= 1) {
	    		System.out.print(k);
	    		k = k - 1;
	       }
	        System.out.print("*");
	        System.out.println();
	        i = i - 1;
	      }	
	    System.out.print("*"); sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=1;i<=n;i++) {
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fib aa=new fib();
			System.out.print(aa.fibb(n));
		}
		  for(int i=483;i>0;i=i%3)
		    {
		        System.out.print("*");
		    }
		int i = 1;
		while(i < 5) {
		    if(i == 3) {
		        continue;
		    }
		    System.out.print(i + " ");
		    i++;
		}
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int choice=sc.nextInt();
		if(choice==1){
				int sum =0;
			for(int i=1;i<=n;i++){
					sum =sum+i;
			}
			System.out.println(sum);
		}else if(choice ==2){
				int mul =1;
			for(int i=1;i<=n;i++){
					mul =mul*i;
			}
			System.out.println(mul);
		}else{
			System.out.println("1");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n+3;i++){
			int curd=3*i+2;
			if(curd%4!=0){
				System.out.print(curd+" ");
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  i=1,j=1;
		while(j<=n&&j<=1000){
			int curd = (3 * i) + 2;
			if (curd % 4 != 0) {
				System.out.print(curd + " ");
				j++;
			}
			i++;
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			int prn=n%10;
			if(prn>0){
				System.out.print(prn);
			}
			//System.out.print(prn);
			n=n/10;

		}
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dec=1;
		int num=0;
		while(n>0){
	       int ld=n%10;
		    num=num+ld*dec;
		   dec=dec*2;
		   n=n/10;
		}
		System.out.println(num);*/
		Scanner s = new Scanner (System.in);
	    int N = s.nextInt();
	    
	    
	    int[] a= new int[N];
	    for (int i =0; i<N;i++)
	    {
	        a[i]= s.nextInt();
	    }
	    int [] A= new int [N-1];

	    for ( int i =0;i<N-1;i++)
	    {
	        if ( a[i]==a[i+1])
	        {
	            System.out.println("false");
				return ;
	        }
	        A[i]= a[i] -a[i+1];
	    }
	    for ( int i =0;i<N-1;i++)
	    {
	        
	            System.out.println(A[i]);
				
	        
	    }

	}
	
	}
/*class fib{
	int fibb(int n) {
		 if (n <= 1)
		        return n;
		    return fibb(n - 1) + fibb(n - 2);
			
	}
}

}*/


		
	


