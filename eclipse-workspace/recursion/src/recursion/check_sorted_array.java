package recursion;
class issorted{
	public boolean checksorted(int arr[]) {
		if(arr.length<=1) {
			return true;
		}
		int input[]=new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			input[i-1]=arr[i];
		}
		boolean answer=checksorted(input);
		if(!answer) {
			return false;
		}
		if(arr[0]<=arr[1]){
			return true;
		}else {
			return false;
		}
			/*if(!smallAns){
				return false;
			}
			if(input[0] <= input[1]){
				return true;
			}else{
				return false;
			}*/
		
	}
}




public class check_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]={1,3,10,4,5,6,7};
			
			issorted obj=new issorted();
			System.out.println(obj.checksorted(arr));
	}

}