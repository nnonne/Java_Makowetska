import java.util.Scanner;
public class lab_1_2 {
	public static void main(String[] args) {
		int[] mas = new int[100];
		Scanner in = new Scanner(System.in); 
		System.out.println("Input n:" );
		int n;
		int i = 1;
		int mx,mn;
		n = in.nextInt();
		System.out.println("Input your massive:" );
		mas[i] = in.nextInt();
		mx = mas[i];
		mn = mas[i];
		while (i < n) {
			i ++;
			mas[i] = in.nextInt();
			if (mas[i] == 0) {
				break;
			}
			if (mas[i] > mx) {
				mx = mas[i];
			}
			if (mas[i] < mn) {
				mn = mas[i];
			}
			
		}
		in.close();
		System.out.println(mx);
		System.out.println(mn);
	}
}
