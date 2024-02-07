package dynamic_programing;

public class squarre_dp {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
	 	int m=input.length;
		int n=input[0].length;
		int dp[][]=new int [m][n];
		for(int i=0;i<m;i++){
			if(dp[i][0]==1){
				dp[i][0]=0;
			}else{
				dp[i][0]=1;
			}
		}
			for(int i=0;i<n;i++){
				if(dp[0][i]==1){
						dp[0][i]=0;
				}else{
					 dp[0][i]=1;
				}
			}
			
	for(int i=1;i<m;i++){
		 for(int j=1;j<n;j++){
        if(input[i][j]==1){
			dp[i][j]=0;
		}else{

			dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
		}

		 }
	}
	for(int i=0;i<m;i++){
		 for(int j=0;j<n;j++){
			 System.out.print(dp[i][j]); 
		 }
		 System.out.println();
		 }
	 System.out.println(m);
	 System.out.println(n);
	return dp[m-1][n-1];
	
	}
		public static void main (String  args[]) {
			int dp[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
			System.out.print( findMaxSquareWithAllZeros(dp));
		}
}
