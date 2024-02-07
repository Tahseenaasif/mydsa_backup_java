package dynamic_programing;

public class staircase {
	public static  int minimumpath(int arr[][],int i,int j) {
		int m=arr.length;
		int n=arr[0].length;
		int dp[][]=new int[m][n];
		
		for(int k=0;k<m;k++) {
			dp[0][k]=arr[0][k];
		}
		for(int k=0;k<m;k++){
			dp[k][0]=arr[k][0];
		}
		for(int k=1;k<m;k++) {
			for(int l=1;l<n;l++) {
				dp[k][l]=arr[k][l]+Math.min(arr[k-1][l-1],Math.min(arr[k][l-1],arr[k-1][l]));
				
			}
		}
	  return dp[m-1][n-1];
		
	}
	public static int maxMoneyLooted(int[] houses) {
		// int do[]=new int[houses.length+1];
		// dp[0]=houses[0];
		// 	for(int i=1;i<houses.length;i++){
        //      dp[i]=
	// 	}
	int index=0;
return 	heplerrecursive(houses,index);



	// 		int sumodd=0; int sumeven=0;
	// 	for(int i=0;i<houses.length;i++){
	// 		if(i%2==0){
	// 				 sumodd+=houses[i];
	// 		}else{
	// 				sumeven+=houses[i];
	// 		}	
	// 	}
	// 	return Math.max(sumodd,sumeven);
	// }
	}
   public static int heplerrecursive(int []houses,int index){
	   	if(index>=houses.length){
			   return 0;
		   }
   int includ1=houses[index] + heplerrecursive(houses, index+2);
   int notinclud=heplerrecursive(houses, index+1);
return Math.max(includ1,notinclud);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {5,5,10,100,10,5};
     //System.out.println( maxMoneyLooted(arr));
     int arr1[][]= {{1,2,4,8},{9,5,1,6},{3,2,4,5}};
     System.out.println( minimumpath(arr1,0,0));
	}

}
