
public class lab_2_03 {
	static void meth(char c) {
		System.out.println(Integer.toBinaryString(c));
	}
	public static void main(String[] args){
		char a = '1';
		char b = 'b';
		char c = '3';
		meth(a);
		meth(b);
		meth(c);
	}
}
