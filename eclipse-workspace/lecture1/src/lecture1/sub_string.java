package lecture1;

public class sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="pqrs";
		int n=str.length();
		/*for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				for(int k=i;k<=j;k++) {
				System.out.print(str.charAt(k));
			}
			System.out.println(" ");
		}

	}*/
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				int end=i+j-1;
				System.out.println(str.substring(j,end+1));
			}
		}
	}
}

