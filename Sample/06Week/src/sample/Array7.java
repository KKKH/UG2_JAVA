package sample;

public class Array7 {
	static String[] temp(int[] ai) {
		System.out.println( ai[0] + ai[1] + ai[2]);
		String[] as = {"One","two","three"};
		return as;
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		String[] s1 = temp(a1);
		System.out.println(s1[0] + "ÅA" + s1[1] + "ÅA" + s1[2]);
	}
}