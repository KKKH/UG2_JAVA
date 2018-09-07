package sample;

public class GenericsTest3 {
	
    public static void main(String[] anyArguments) {
    	
        java.util.ArrayList arraylist = new java.util.ArrayList();
        arraylist.add("‚ ‚¢‚¤‚¦‚¨");
        arraylist.add("‚©‚«‚­‚¯‚±");
        String i1 = (String)arraylist.get(0);
        String i2 = (String)arraylist.get(1);
    }
}
