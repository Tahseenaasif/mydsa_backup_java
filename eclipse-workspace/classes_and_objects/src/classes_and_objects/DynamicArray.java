package classes_and_objects;

public class DynamicArray {
	 private int data[];
	 private int nextindex;
 public DynamicArray() {
	 data=new int[5];
	  nextindex=0;
  }
 public void add(int element) {
	if(nextindex==data.length) {
		restructure();
	}
	data[nextindex]=element;
     	nextindex++;
 }
  public int size(){
	  return nextindex;
  }
  public void set(int index,int element) {
	  if(index>nextindex) {
		  return;
	  }
	  if(index<nextindex) {
		  data[nextindex]=element;
	  }else {
		  add(element);
	  }
  }
  public int get(int index) {
	  if(index>data.length) {
		  return -1;
	  }
	  return data[index];
  }
  public boolean isEmpty(){
	  if(size()==0) {
		  return true;
	  }else {
	return false;
	  }
	  
  }
  public int  removeLast() {
	  if(size()==0) {
		  return -1;
	  }
	  int value =data[nextindex-1];
	  data[nextindex-1]=0;
	  nextindex--;
	  return value;
  }
public void restructure() {
	int temp[]=data;
		data=new int[nextindex*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
   }
}






























import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}

}