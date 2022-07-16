import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[a];
		for(int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		int max = 0;
		int sum = 0;
		for(int i = 0; i < a - 2; i++) {
			for(int k = i + 1; k < a - 1; k++) {
				for(int q = k + 1; q < a; q++) {
					sum = c[i] + c[k] + c[q];
					if(max <= sum && sum <= b) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}
