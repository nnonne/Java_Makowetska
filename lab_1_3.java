import java.util.Scanner;
import java.lang.Math;
public class lab_1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n;
		System.out.println("Input n: ");
		n = in.nextInt();
		double[] mas = new double[n];
		double sum = 0f;
		for(int i = 0; i < n; i++){
			mas[i] = in.nextDouble();
			sum += mas[i];
		}
		in.close();
		double m = sum/n;
		System.out.println("Mean: " +  m);
		double stDev = 0;
		for (double num: mas) {
			stDev += Math.pow(num - m, 2);
		}
		System.out.println("standart deviation: " + stDev);
	}
}
