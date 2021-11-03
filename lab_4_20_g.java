import java.util.Scanner;
public class lab_4_20_g {
	public static void main(String[] args) {
			float eps,x;
			Scanner in = new Scanner(System.in);
	        System.out.print("¬вед≥ть eps: ");
	        eps = in.nextFloat();
	        System.out.print("¬вед≥ть x: ");
	        x = in.nextFloat();
	        in.close();
	        float pow = x * x;
	        float y = 2*x;
	        int i = 1;
	        int p = 1;
	        while (x > eps ) {
	        	
	        	x *= pow/((i+1)*(i+2));
	        	y += x;
	        	i += 2;
	        }
	    System.out.print(y);
	}
}