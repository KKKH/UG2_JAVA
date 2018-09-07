package sample;

public class LabelTest2 {

	public static void main(String[] args) {
		Test:
			for(int i = 0;i < 3;i++){
				System.out.print("i = " + i + "\t");
				for(int k = 0;k < 3; k++) {
					System.out.print("k = " + k + "\t");
					if(k == 1) break Test;
				}
				System.out.print("\n");
			}
	}

}
