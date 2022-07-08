import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[9][9];
		int max = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(a[i][j] == max) {
					System.out.println(max);
					System.out.println((i+1) + " " + (j + 1));
				}
			}
		}
	}

}