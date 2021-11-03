import java.lang.Math;
public class lab_3_3 {
	public static int RollDie() {
		int flag = (int)(Math.random() * 6) + 1;
		return flag;
	}
	public static void main(String[] args) {
		System.out.print(RollDie());
		}
}