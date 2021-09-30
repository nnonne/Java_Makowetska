import java.util.Scanner;
import static java.lang.Math.sqrt;
public class lab_3_25 {
	public static void main(String[] args) {
		float x0,y0,x,y;
		Scanner in = new Scanner(System.in);
        System.out.print("¬вед≥ть x0: ");
        x0 = in.nextFloat();
        System.out.print("¬вед≥ть y0: ");
        y0 = in.nextFloat();
        System.out.print("¬вед≥ть x: ");
        x = in.nextFloat();
        System.out.print("¬вед≥ть y: ");
        y = in.nextFloat();
        System.out.print("¬≥дстань м≥ж цими точками: " + sqrt((x-x0)*(x-x0) + (y-y0)*(y-y0)));
        in.close();
        
	}
}
