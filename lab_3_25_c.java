
import java.util.Scanner;
public class lab_3_25_c {
	public static void main(String[] args) {
		float a,b,c;
		Scanner in = new Scanner(System.in);
        System.out.print("Введіть a: ");
        a = in.nextFloat();
        System.out.print("Введіть b: ");
        b = in.nextFloat();
        System.out.print("Введіть c: ");
        c = in.nextFloat();
        float y = (a*c - c)/(1-a*b);
        float x = -c - b*y;
        
        System.out.print("Координати точки перетину прямих: М(" + x + "," + y + ")");
        in.close();
	}
}
