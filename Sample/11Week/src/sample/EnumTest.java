package sample;

public class EnumTest {
	enum OkNo {OK,NO};
	public static void main(String[] args) {
		OkNo status = OkNo.OK;
		if (OkNo.OK == status) {
			System.out.println("OK‚Å‚·");
		}
	}
}

