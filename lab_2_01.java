
public class lab_2_01 {
	public static void main(String[] args){
		final int x = 0b11101;
		final int y = 0b101010;
		//int z = 0b11111111111111111111111111111000;
		//System.out.println(z);
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(x^y));
		System.out.println(Integer.toBinaryString(x|y));
		System.out.println(Integer.toBinaryString(y/x));
		System.out.println(Integer.toBinaryString(y >> 1));
		System.out.println(Integer.toBinaryString(x << 2));
		System.out.println(Integer.toBinaryString(y >>> 1));
		System.out.println(Integer.toBinaryString(~y));
	}
}
