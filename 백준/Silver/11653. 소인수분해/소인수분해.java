import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 2; i <= a; i++) {
			while(a % i == 0) {
				a = a / i;
				System.out.println(i);
			}
		}
	}

}