import java.util.Scanner;
public class lab_1_21 {
	public static void Tree() {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("input n");
		n = in.nextInt();
		in.close();
		String s = "";
		int k = n-1;
		for (int i = 1; (i+1)/2 <= n; i += 2) {
			for(int j = 0; j < k;j++) {
				s+= ".";
			}
			for(int l = 0; l<i; l++) {
				s+= "*"; 
			}
			for(int j = 0; j < k;j++) {
				s+= ".";
			}
			k-=1;
			s+= "\n";
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		Tree();
		}
}
