import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lab_2_1 {
	static Scanner in = new Scanner (System.in);
	
	static void showMatrix(int[][]matr) {
		for (int i=0; i<matr.length; ++i) {
			String s = "";
			for (int j=0; j<matr.length; ++j) {	
				s += " "+matr[i][j]+" ";
			}
			System.out.println(s);
		}
	}
	
	static int[][] inputRandomSquareMatrix(int n) {
		int[][] res= new int[n][n];
		for (int i=0; i<n*n;++i) {
			Random random = new Random();
			res[i/n][i%n]=random.nextInt(4*n+1)-2*n;
		}
		showMatrix(res);
		return res;
	}

	static int [][] sortRows(int[][] matr){
		int n=matr.length;
		int[][] res= new int[n][n];
		for (int i=0; i<n;++i) {
			res[i]=matr[i].clone();
			Arrays.sort(res[i]);
		}
		showMatrix(res);
		return res;
	}
	public static void main(String[] args) {
		int n;
		System.out.println("input n:");
		n = in.nextInt();
		System.out.println("random matrix: ");
		int[][] a = inputRandomSquareMatrix(n);
		System.out.println("sorted matrix: ");
		int[][] b = sortRows(a);
		}
}
