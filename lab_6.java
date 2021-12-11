package hw_11;

import java.util.Scanner;

public class lab_6 {
	public static void main(String[] args){
		String s;
	    Scanner sc = new Scanner(System.in);
	    s = sc.nextLine();
	    int n = s.length();
	    sc.close();
	    String ans = "";
	    for (int i = n-1; i >= 0; i--) {
	    	ans += String.valueOf(s.charAt(i));
	    }
	    System.out.print(ans);
	}
}
