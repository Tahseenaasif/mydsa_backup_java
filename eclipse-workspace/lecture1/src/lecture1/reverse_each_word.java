package lecture1;

public class reverse_each_word {
	public static String reverseEachWord(String str) {
		//Your code goes here
		String res="";
		int i=0,j=0;
		while(j<str.length()){
			if(str.charAt(j)!=' '){
				j++;
			}else{
				for(int k=j;k>=i;k--){
					res+=str.charAt(k);
				}
				//res+=" ";
				i=j+1;
				j=i+1;
			}
			
		}
		res +=" ";
		for (int k =str.length()-1 ; k >= i; k--) {
			res += str.charAt(k);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Coding Ninjas tahseen haa dd d";
		String ress=reverseEachWord(str);
		System.out.println(ress);
	}

}
