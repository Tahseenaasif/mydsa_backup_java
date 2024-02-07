package lecture1;

public class gen<t,v> {
		 private t first;
		 private v second;
		 public  gen(t first,v second) {
			 this.first=first;
			 this.second=second;
		 }
		 public void setfirst(t first) {
			 this.first=first;
		 }
		 public void setsecond(v second) {
			 this.second=second;
		 }
		 public t getfirst() {
			 return first;
		 }
		 public v getsecond() {
			 return second;
		 }
	 }

