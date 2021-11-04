import java.util.Scanner;
public class lab_1_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		
		Double bestX=Double.NaN;
		Double bestY=Double.NaN;
		Double bestZ=Double.NaN;
		Double bestDist=Double.POSITIVE_INFINITY;
		
		while (in.hasNextDouble()) {
			double xi=in.nextDouble();
			double yi=in.nextDouble();
			double zi=in.nextDouble();
			double dist= Math.pow(x-xi, 2)+Math.pow(y-yi, 2)+ Math.pow(z-zi, 2);
			if (dist<bestDist) {
				bestX=xi;
				bestY=yi;
				bestZ=zi;
				bestDist=dist;
			}
		}
		in.close();
		System.out.printf("Clossest point = (%f, %f, %f)\n",bestX, bestY, bestZ);
		

	}

}