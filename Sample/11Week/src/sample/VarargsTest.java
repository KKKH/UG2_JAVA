package sample;

class VarargsTest {
	static void myPrint (String... args) {
		for (String s : args)
			System.out.print(s);
	}
	public static void main(String[] args) {
		myPrint("‚ \n");
		myPrint("‚ ", " ", "‚¢\n");
		myPrint("‚ ", " ", "‚¢", " ", "‚¤\n");
	}
}
