package sample;
public class GenericsTest4 {
	public static void main(String[] anyArguments) {
		java.util.ArrayList<String> arraylist = new java.util.ArrayList<String>();
		arraylist.add("‚ ‚¢‚¤‚¦‚¨");
		arraylist.add("‚©‚«‚­‚¯‚±");
		String i1 = arraylist.get(0);
		String i2 = arraylist.get(1);
	}
}