package classes_and_objects;

public class fraction2 {
	private int numerator;
	private int denominator;
	public fraction2(int numerator,int denominator) {
		this.numerator=numerator;
		if(denominator==0) {
			//error;
		}
		this.denominator=denominator;
		simplify();
	}
	public void setdenominator(int  denominator) {
		this.denominator=denominator;
		simplify();
	}
	public int getdenominator() {
		return denominator; 
	}
	public void setnumerator(int  numerator) {
		this. numerator= numerator;
		simplify();
	}
	public int getnumerator() {
		return numerator; 
	}
	public void simplify() {
		int ll=Math.min(numerator,denominator);
		int gcd=1;
		for(int i=2;i<ll;i++) {
			if(numerator%i==0&&denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	public void print() {
		if(denominator==1) {
			System.out.println(denominator);
		}
		System.out.println(numerator+"/"+denominator);
	}
	public void add(fraction2 f2) {
		this.numerator=this.numerator*f2.denominator+f2.numerator*this.denominator;
		this.denominator=f2.denominator*this.denominator;
		simplify();
		
	}
	public fraction2 add(fraction2 f1,fraction2 f2) {
		int newNum =f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		int newDen = f2.denominator*f1.denominator;
		fraction2 f=new fraction2(newNum, newDen);
		return f;
		
	}
	public void multiply(fraction2 f) {
		this.numerator=this.numerator*numerator;
		this.denominator=this.denominator*denominator;
	}

}
