import java.util.Scanner;
public class lab_1_4 {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int x, maxR=1, prev=Integer.MIN_VALUE, maxRow=-1, xmax=Integer.MIN_VALUE;
		while(in.hasNextInt()) {
			x=in.nextInt();
			if(x==prev)maxR++;
			else {
				if(maxR>maxRow) {
					xmax=prev;
					maxRow=maxR;
				}
				maxR=1;
			}
			prev = x;
		}
		in.close();
		System.out.println(maxRow + " times in a row " + prev);
	}

}

