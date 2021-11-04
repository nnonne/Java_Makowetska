
public class lab_1_1 {
	public static void main(String[] args) {
		String[] a = {"a1","a2","a3"};
		for (String s: a) {
			System.out.println(s);
		}
		String[] b = new String[2];
		b[0] = "b1";
		b[1] = "b2";
		for (int i = 0; i < b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
