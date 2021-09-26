import java.util.Scanner;
public class lab_2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String x = in.nextLine();
        System.out.println("Привіт, " + x);
        in.close();
	}
}
