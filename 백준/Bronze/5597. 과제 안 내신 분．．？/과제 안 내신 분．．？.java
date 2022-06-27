import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[31];
		int b;
		for(int i = 0; i < 28; i++) {
			b = sc.nextInt();
			a[b] = 999;
		}
		for(int i = 1; i < 31; i++) {
			if(a[i] != 999) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}