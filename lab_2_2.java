import java.util.Scanner;
import java.util.Random;

public class lab_2_2 {
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
	static void cyclicShift(int[][]matr, int k) {
		for (int i=0; i<matr.length; ++i) {
			int[] row =new int [matr[i].length];
			for (int j=0; j <matr[i].length;j++) {
				if (j+k<matr[i].length) {
					row[j]=matr[i][j+k];
				}
				else {
					row[j]=matr[i][j+k-matr[i].length];
				}
			}
			for (int j=0; j <matr[i].length;j++) {
				matr[i][j]=row[j];
			}
		}
	}
	public static void main(String[] args) {
		int n,k;
		System.out.println("input n:");
		n = in.nextInt();
		System.out.println("input k:");
		k = in.nextInt();
		System.out.println("random matrix: ");
		int[][] a = inputRandomSquareMatrix(n);
		System.out.println("shifted matrix: ");
		cyclicShift(a,k);
		showMatrix(a);
		}
}