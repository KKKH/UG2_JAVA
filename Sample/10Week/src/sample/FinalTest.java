package sample;

public class FinalTest {

	final static int HOUR = 24;
	
	public static void main(String[] args) {
		System.out.println("一日は" + HOUR + "時間");
	    HOUR = 0;
    }
}
