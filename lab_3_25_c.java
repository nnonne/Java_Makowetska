
import java.util.Scanner;
public class lab_3_25_c {
	public static void main(String[] args) {
		float a,b,c;
		Scanner in = new Scanner(System.in);
        System.out.print("������ a: ");
        a = in.nextFloat();
        System.out.print("������ b: ");
        b = in.nextFloat();
        System.out.print("������ c: ");
        c = in.nextFloat();
        float y = (a*c - c)/(1-a*b);
        float x = -c - b*y;
        
        System.out.print("���������� ����� �������� ������: �(" + x + "," + y + ")");
        in.close();
	}
}
