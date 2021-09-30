import java.util.Scanner;
import static java.lang.Math.sqrt;
public class lab_4_5 {
	public static double LineLength(float x1, float y1, float x2, float y2) {
		double len = sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
		return len;
	}
	public static double Area(double a, double b, double c) {
		double p = (a+b+c)/2;
		double area = sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	public static void main(String[] args) {
		float ax,ay,bx,by,cx,cy;
		Scanner in = new Scanner(System.in);
        System.out.print("Введіть координати точки А: ");
        ax = in.nextFloat();
        ay = in.nextFloat();
        System.out.print("Введіть координати точки B: ");
        bx = in.nextFloat();
        by = in.nextFloat();
        System.out.print("Введіть координати точки C: ");
        cx = in.nextFloat();
        cy = in.nextFloat();
        double a = LineLength(cx,cy,bx,by);
        double b = LineLength(ax,ay,cx,cy);
        double c = LineLength(ax,ay,bx,by);
        System.out.print("S = " + Area(a,b,c));
        in.close();
	}
}

