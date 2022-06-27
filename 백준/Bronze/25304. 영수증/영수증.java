import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < b; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			sum = sum + c * d;
		}
		if(sum == a) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}