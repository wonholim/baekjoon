import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		int c = sc.nextInt();
		for(int j = 0; j < a; j++) {
			if(b[j] == c) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
