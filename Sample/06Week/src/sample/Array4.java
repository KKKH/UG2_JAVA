package sample;

public class Array4 {
	public static void main(String[] args) {
		int[][] array = new int[3][];
		array[0] = new int[] {10};
		array[1] = new int[] {20, 30, 40};
		array[2] = new int[] {50, 60};
		System.out.println(array[0][0]);
		System.out.println(array[1][0] + "\t" + array[1][1]+ "\t" + array[1][2]);
		System.out.println(array[2][0] + "\t" + array[2][1]);
	}
}