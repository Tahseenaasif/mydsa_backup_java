package hashmap;

public class driver_function_for_hashmap {

	public static void main(String[] args) {
		    Map<String,Integer> map=new Map<>();
		    for (int i = 0; i < 20; i++) {
				map.insert("abc" + i, 1 + i);
				System.out.println("i = " +  i + " lf =  " + map.LaodFactor());
			}
			
			map.remove("abc3");
			map.remove("abc7");
			
			for (int i = 0; i < 20; i++) {
				System.out.println("abc" + i + ":" + map.getvalue("abc" + i));
			}
			
		}
		

	}


