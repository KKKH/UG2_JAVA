package sample;

public class LocalTest2 {
	  static void myAdd(int x, int y){
		    System.out.println(x + y);
		    x = 5;
		    y = 6;
		    System.out.println(x + y);
		  }
	public static void main(String[] args) {
		myAdd(3,4);
	}
}
