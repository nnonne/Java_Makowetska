import java.lang.Math;
import java.util.Scanner;
public class lab_3_4 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner in = new Scanner(System.in);
        System.out.print("¬вед≥ть a: ");
        a = in.nextInt();
        System.out.print("¬вед≥ть b: ");
        b = in.nextInt();
        System.out.print("¬вед≥ть c: ");
        c = in.nextInt();
        in.close();
        if (a == b && b == c) {
        	System.out.print(1);
        }
        else if (a != b && b != c && c != a) {
        	System.out.print(3);
        }
        else {
        	System.out.print(2);
        }
	}
}
