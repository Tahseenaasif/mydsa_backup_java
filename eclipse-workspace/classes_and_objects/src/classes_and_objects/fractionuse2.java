package classes_and_objects;

public class fractionuse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction2 f1 = new fraction2(20,30);
		f1.print();
		// 2/3
		fraction2 tt;
		System.out.println(tt);
		f1.setnumerator(12);
		// 4/1
		int d = f1.getdenominator();
		System.out.println(d);
		f1.print();
//		
		f1.setnumerator(10);
		f1.setdenominator(30);
		// 1/3
		f1.print();
//		
		fraction2 f2 = new fraction2(3,4);
		f1.add(f2);                             

		f1.print();
		// f1 => 13/12
		f2.print();
		// f2 => 3/4
//		
		fraction2 f3 = new fraction2(4,5);
		f3.multiply(f2);
		f3.print();
		// f3 => 3/5
		f2.print();
		// f2 => 3/4
//		
		//fraction2 f4 = fraction2.add(f1, f3);
		f1.print();
		f3.print();
		//f4.print();
	}

	

}
