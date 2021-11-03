import java.lang.Math;
public class lab_3_2 {
	public static void main(String[] args) {
		int flag = (int)(Math.random() * 100);
		System.out.print("flag = " + flag + '\n');
		int x;
		for (int i = 0; i < 25; i++) {
			x = (int)(Math.random() * 100);
			if (x < flag) {
				System.out.print(x + " is less than " + flag);
			}
			else if (x > flag) {
				System.out.print(x + " is greater than " + flag);
			}
			else {
				System.out.print(x + " is equal to " + flag );
			}
			System.out.print("\n");
		}
	}
}
