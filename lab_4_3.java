import java.util.Scanner;
public class Main{
  static float Rosenbrock2D(float x, float y) {
    float a = x*x-y;
    float ans = 100*a*a + (x-1)*(x-1);
    return ans;
  }
	public static void main(String[] args) {
	    float a = Rosenbrock2D(0,0);
		System.out.println(a);
		float b = Rosenbrock2D(1,0);
		System.out.println(b);
		float c = Rosenbrock2D(0,1);
		System.out.println(c);
		Scanner in = new Scanner(System.in);
        System.out.print("Input x: ");
        float x = in.nextFloat();
        System.out.print("Input y: ");
        float y = in.nextFloat();
        in.close();
        System.out.println(Rosenbrock2D(x,y));
	}
}
