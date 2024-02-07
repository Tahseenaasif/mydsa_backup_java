package classes_and_objects;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}

}
public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	//private int nextindex;
		private int coff[];
/*	public void add(int element) {
		if (nextindex == coff.length) {
			restructure();
		}
		coff[nextindex] = element;
		nextindex++;
	}*/
//	int coffieient[];
		public void Polynimial(){
			coff = new int[5];
		//	nextindex = 0;
		}
	public int setCoefficient(int degree, int coeff){
					//int degree=nextindex;
			if (degree >=coff.length) {
			restructure();
		}
		coff[degree] = coeff;
	//	nextindex++;
		
	}
	
	public void restructure() {
		int temp[] = coff;
		coff = new int[coff.length * 2];
		for (int i = 0; i < temp.length; i++) {
			coff[i] = temp[i];
		}
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0;i<coff.length;i++){
			if(coff[i]==0){

			}else{
					System.out.println(i+"x"+coff[i]+" ");
			}
			
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
				int lenp1=this.coff.length;
				int lenp2 = p.coff.length;
				int min= Math.min(lenp1,lenp2);
				int max= Math.max(lenp1,lenp2);
				for(int i=0;i<min;i++){
					this.coff[i]+=p.coff[i];
				}
				 Polynomial np=new  Polynomial();
				 for(int i=0;i<this.coff.length;i++){
					 np.coff[i]=this.coff[i];
				 }
		return np;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
	//	int lenp1 = this.coff.length;
	//int lenp2 = p.coff.length;
	//	int min = Math.min(lenp1, lenp2);
	//	int max = Math.max(lenp1, lenp2);
	if(this.coff.length> p.coff.length){
		for (int i=0; i < p.coff.length ; i++) {
			this.coff[i] -= p.coff[i];
		}
		}else{
			int temp[]=new int[p.coff.length];
			for (int i= 0; i <this.coff.length ; i++) {
			this.coff[i] -= p.coff[i];
		}    
		      int st=this.coff.length;
		for(int i=st; i< coff.length; i++) {
			   this.coff[i] = setCoefficient(i, p.coff[i]);
		}
		}
	}        int range=this.coff.length;
				Polynomial np = new Polynomial();
		    for (int i=0;i<range;i++) {
		     	np.coff[i] = this.coff[i];
		   }
		return np;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int lenp1 = this.coff.length;
		int lenp2 = p.coff.length;
		//int max = Math.max(lenp1, lenp2);
		//int min = Math.min(lenp1, lenp2);
		for (int i = 0; i < lenp1; i++) {
			for (int j = i; j < lenp2; j++)
			this.coff[i] *= p.coff[j];
		}
		Polynomial np = new Polynomial();
		for (int i = 0; i < this.coff.length; i++) {
			np.coff[i] = this.coff[i];
		}
		return np;
	}
	}

}