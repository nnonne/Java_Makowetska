package hw_11;

import java.util.Scanner;



public class lab_25 {
	public static void main(String[] args){
		String s;
	    Scanner sc = new Scanner(System.in);
	    s = sc.nextLine();
	    int n = s.length();
	    sc.close();
	    int len = 0;
	    String longest = "";
	    for (int i = 0; i < n; i++) {
	    	String current = String.valueOf(s.charAt(i));
	    	do {
	    		i++;
	    		current += s.charAt(i);
	    	}while (((int)s.charAt(i-1) - (int)s.charAt(i)) == 1 && i < n);
	    	if (current.length() > len) {
	    		len = current.length();
	    		longest = current;
	    	}
	    }
	    System.out.print(longest);
	}
}