import java.util.Scanner;
import java.lang.Math.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = in.nextDouble();
        in.close();
        System.out.println("Hello World");
		System.out.println((int)x); //ціла
		if (x > 0){
		System.out.println((float)x - (int)x); //дробова
		System.out.println((int)x + 1); //більше
		System.out.println((int)x); // менше
		}
		if (x<0){
		    System.out.println(-1*((float)x - (int)x)); //дробова
		    System.out.println((int)x); //більше
		    System.out.println((int)x-1); // менше
		}
		System.out.println((int)((int)x + 2*((float)x - (int)x))); //округлене
	}
}
