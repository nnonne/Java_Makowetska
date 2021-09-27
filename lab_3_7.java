import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    double gamma = 6.673E-11;
	    Scanner in = new Scanner(System.in);
        System.out.print("Input m1: ");
        double m1 = in.nextDouble();
        System.out.print("Input m2: ");
        double m2 = in.nextDouble();
        System.out.print("Input r: ");
        double r = in.nextDouble();
        //System.out.printf("m1: %d \n", num);
        in.close();
	    double ans = gamma * m1 * m2 / (r*r);
		System.out.println(ans);
	}
}
