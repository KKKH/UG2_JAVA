package sample;

public class IfTest3 {
	public static void main(String[] args) {
	    java.util.Random r = new java.util.Random();
	    int a = r.nextInt(3);
	    if (a == 0) {
	      System.out.println("a = 0");
	    }
	    else if (a == 1) {
	      System.out.println("a = 1");
	    }
	    else {
	      System.out.println("a = ?");
	    } 
	}
}
