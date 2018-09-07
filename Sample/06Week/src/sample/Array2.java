package sample;

public class Array2{
	public static void main(String[] args) {
		String[] s1;
		s1 = new String[4];
		s1[0] = new String("t");
		s1[1] = new String("‰Ä");
		s1[2] = new String("H");
		s1[3] = new String("“~");
		System.out.println(s1[0] + "\t" + s1[1] + "\t" + s1[2] + "\t" + s1[3]);
		String[] s2;
		s2 = new String[4];
		s2[0] = "t";
		s2[1] = "‰Ä";
		s2[2] = "H";
		s2[3] = "“~";
		System.out.println(s2[0] + "\t" + s2[1] + "\t" + s2[2] + "\t" + s2[3]);
		String[] s3 = new String[]{"t","‰Ä","H","“~"};
		System.out.println(s3[0] + "\t" + s3[1] + "\t" + s3[2] + "\t" + s3[3]);
		String[] s4 = {"t","‰Ä","H","“~"};
		System.out.println(s4[0] + "\t" + s4[1] + "\t" + s4[2] + "\t" + s4[3]);
	}
}