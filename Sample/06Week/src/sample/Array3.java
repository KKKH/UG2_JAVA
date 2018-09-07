package sample;

public class Array3 {
	public static void main(String[] args) {
		int[][] array = new int[2][3];
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		System.out.println(array[0][0] + "\t" + array[0][1] + "\t" + array[0][2]);
		System.out.println(array[1][0] + "\t" + array[1][1] + "\t" + array[1][2]);
	}
}