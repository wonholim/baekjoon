import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = 0;
			for(int k = 1; k <= b; k++) {
				c = c + sum(k);
			}
			System.out.println(c);
		}
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		int a = 0 ;
		for(int j = 1; j <= i + 1; j++) {
			a = a + j;
		}
		return (i * a);
	}

}
