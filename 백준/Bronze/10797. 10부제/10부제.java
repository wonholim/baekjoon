import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] b = new int[5];
		int count = 0;
		for(int i = 0; i < 5; i++) {
			b[i] = sc.nextInt();
			if(b[i] == A || b[i] == 10 + A || b[i] == 20 + A || b[i] == 30 + A) {
				count++;
			}
		}
		System.out.println(count);
	}

}