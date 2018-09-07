package sample;

public class Array5 {
	public static void main(String[] args) {
		int[] a1 = {40,50,60};
		int[] a2 = new int[3];
		System.arraycopy(a1, 0, a2, 0, 3);
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		System.out.println(a1[0] + "\t" + a1[1]+ "\t" + a1[2]);
		System.out.println(a2[0] + "\t" + a2[1]+ "\t" + a2[2]);
	}
}