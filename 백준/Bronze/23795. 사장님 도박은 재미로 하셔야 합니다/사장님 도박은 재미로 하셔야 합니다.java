import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int a = sc.nextInt();
			if(a == -1) {
				break;
			}
			sum = sum + a;
		}
		System.out.println(sum);
	}

}
