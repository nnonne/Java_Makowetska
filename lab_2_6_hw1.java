import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.round;
public class lab_2_6_hw1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("������ ���� ������� �����:  ");
        int x = in.nextInt();
        System.out.println("������� " + x + " ���������� �����");
        in.close();
        String y = "����� � �����: ";
        for (int i = 0; i < x; i++) {
        	float a = round(random() * 100);
        	System.out.println(a);
        	y += a + " ";
        }
        System.out.println(y);
	}
}
