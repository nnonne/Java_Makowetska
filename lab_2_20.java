import java.util.Scanner;
public class lab_2_20 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.print("¬вед≥ть N: ");
        int N = in.nextInt();
        in.close();
        String ans = "";
        int len = 0;
        while (N != 0) {
        	ans += (N%2);
        	N = N/2;
        	len ++;
        }
        for (int i = len; i <= 28; i++) {
        	ans += 0;
        }
        System.out.print(ans);
        
	}
}
