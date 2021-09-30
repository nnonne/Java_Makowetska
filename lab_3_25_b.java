import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
public class lab_3_25_b {
	public static void main(String[] args) {
		float x0,y0,a,b,c;
		Scanner in = new Scanner(System.in);
        System.out.print("¬вед≥ть x0: ");
        x0 = in.nextFloat();
        System.out.print("¬вед≥ть y0: ");
        y0 = in.nextFloat();
        System.out.print("¬вед≥ть a: ");
        a = in.nextFloat();
        System.out.print("¬вед≥ть b: ");
        b = in.nextFloat();
        System.out.print("¬вед≥ть c: ");
        c = in.nextFloat();
        float up = abs(a*x0 + b*y0 + c);
        double down = sqrt(a*a + b*b);
        System.out.print(up/down);
        in.close();
        
	}
}
