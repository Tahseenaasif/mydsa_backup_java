package tic_tac_toe_game;

public class board {
      private char board[][];
      private int boardsize=3;
      private char p1symbol,p2symbol;
      private int count;
      public  final static int player_1_Wins=1;
      public final static int player_2_wins=2;
      public final static int Draw=3;
      public final static int Incompleate=4;
      public final static int Invalid=5;
      public board(char p1symbol,char p2symbol){
    	  board=new char[boardsize][boardsize];
    	  for(int i=0;i<boardsize;i++) {
    		  for(int j=0;j<boardsize;j++) {
    			  board[i][j]=' ';
    		  }
    	  }
    	  this.p1symbol=p1symbol;
    	  this.p2symbol=p2symbol;
      }
	public int move(char symbol, int x, int y) {
		  if(x<0 ||x>=board.length ||y<0 ||y>=board.length || board[x][y]!=' '){
			  return Invalid;
		  }
		board[x][y]=symbol;
		count++;
		if(board[x][0]==board[x][1]&&board[x][0]==board[x][2]) {
			return symbol==p1symbol? player_1_Wins :player_2_wins;
		}
		if(board[0][y]==board[1][y] && board[0][y]==board[2][y]) {
			return symbol== p1symbol?player_1_Wins:player_2_wins;
		}
//		if(board[0][x]==board[1][x] && board[1][x]==board[2][x]) {
//			return symbol== p1symbol?player_1_Wins:player_2_wins;
//		}
		if(board[0][0]!=' '&&board[0][0]==board[1][1] && board[0][0]==board[2][2]) {
			return symbol== p1symbol?player_1_Wins:player_2_wins;
		}
		if(board[0][2]!=' '&&board[0][2]==board[1][1] && board[0][2]==board[2][0]) {
			return symbol== p1symbol?player_1_Wins:player_2_wins;
		}
		if(count==boardsize*boardsize) {
			return Draw;
		}
			return Incompleate;
		
	}
	public void print() {
		System.out.println("-----------------");
		for(int i=0;i<boardsize;i++) {
			for(int j=0;j<boardsize;j++){
				System.out.print("| "+board[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------");
		
	}
}
