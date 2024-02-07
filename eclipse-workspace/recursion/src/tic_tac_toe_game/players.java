package tic_tac_toe_game;

public class players {
	 private String name;
	 private char symbol;
	 public players(String name,char symbol){
		 setname(name);
		 setsymbol(symbol);
	 }
	 public void setname(String name){
		 if(!name.isEmpty()) {
			 this.name=name;
		 }
	 }
	 public String getname() {
		 return this.name;
	 }
    public void setsymbol(char symbol){
        		 if(symbol!='\0') {
        			 this.symbol=symbol;
        		 }
	 }
    public char getsymbol(){
    	return this.symbol;
    }
}
