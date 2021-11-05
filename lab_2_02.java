
public class lab_2_02 {
	public static void main(String[] args){
		int y = 0b101010 << 1;
		System.out.println(Integer.toBinaryString(y));
		int x;
		do {
			x = y >>> 1;
			y = x;
			System.out.println(Integer.toBinaryString(y));
		} while (y !=0);
	}
}
