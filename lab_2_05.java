
public class lab_2_05 {
	static void method(int n) {
		//System.out.println(Integer.toBinaryString(n));
		int copy = n;
		int copyc;
		int mult = 0b0;
		do {
			mult = (mult << 1) | 1;
			copyc = copy >> 1;
			copy = copyc;
		}while (copy > 1);
		
		System.out.println((((n&mult) << 1)| copy) );
		
	}
	public static void main(String[] args){
		method(130);
	}
}
