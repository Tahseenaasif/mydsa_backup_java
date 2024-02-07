package tic_tac_toe_game;
import java.util.*;
public class TicTacToe {
  private players p1,p2;
  private board board;
  public void startGame(){
	  Scanner sc=new Scanner(System.in);
	   p1=takeplayerinput(1);
	   p2=takeplayerinput(2);
	  while(p1.getsymbol()==p2.getsymbol()){
		  System.out.println("this symbol is already taken please take another symbool");
		  char newsymbol=sc.next().charAt(0);
		  p2.setsymbol(newsymbol);
	  }
	  board=new board(p1.getsymbol(),p2.getsymbol());
	  boolean playerturn=true;
	  int status=board.Incompleate;
	  while(status==board.Incompleate ||status==board.Invalid){
		  if(playerturn){
			  System.out.println("player 1- "+p1.getname()+"'s turn");
			  System.out.println("Enter x: ");
			  int x=sc.nextInt();
			  System.out.println("Enter y: ");
			  int y=sc.nextInt();
			  status= board.move(p1.getsymbol(),x,y);
			 if(status!=board.Invalid) {
				  playerturn=false;
				  board.print();
			 }else {
				 System.out.println("the move is not valid try again");
			 }
		  }else{
			  System.out.println("player 2- "+p2.getname()+"'s turn");
			  System.out.println("Enter x: ");
			  int x=sc.nextInt();
			  System.out.println("Enter y: ");
			  int y=sc.nextInt();
			      status= board.move(p2.getsymbol(),x,y);
			 if(status!=board.Invalid) {
			       playerturn=true;
			       board.print();
			 }else {
				 
					 System.out.println("the move is not valid try again");
				 
			 }
		  }
	  }
	  if(status==board.player_1_Wins) {
		  System.out.println("player 1 - "+p1.getname()+" wins !!");
	  }else if(status==board.player_2_wins){
		  System.out.println("player 2 - "+p2.getname()+" wins !!");
	  }else {
		  System.out.println("match is draw");
	  }
	  
  }
  private players takeplayerinput(int num) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Player "+num+" name:");
	  String  name=sc.nextLine();
	  System.out.println("Enter player "+num+" Sysmbol");
	  char symbol=sc.next().charAt(0);
	  players p=new  players(name,symbol);
	  return p;
  }
}
