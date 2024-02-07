package bancktracking;

public class N_Queen {
	private static void queen(int[][] board, int row) {
	    int n=board.length;
		if(row==n) {
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(board[i][j]+" ");
				}
			System.out.println();
			}
			System.out.println();
			return ;
		}
		
		for(int col=0;col<n;col++){
			if(issafe(board,row,col)){
			board[row][col]=1;
			queen(board,row+1);
			board[row][col]=0;
			}
		}
		
		
	}

	private static boolean issafe(int[][] board, int row, int col) {
              int i=row,j=col;
		while(i>=0 && j>=0){
			if(board[i][j]==1) {
				return false;
			}
			i--;
			j--;
		}
			    i=row;   j=col;
				while(i>=0) {
					if(board[i][j]==1) {
						return false;
					}
					i--;
		        }
			
			    i=row;   j=col;
				while(i>=0 && j<board.length ){
					if(board[i][j]==1){
						return false;
					}
					i--;
					j++;
		    }
		return true;
	}

	public static void main(String[] args) {
	int n=;
	int board[][]=new int[n][n];
	  queen(board,0);

	}

	
}
