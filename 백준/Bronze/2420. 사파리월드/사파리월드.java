import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if(n - m < 0) {
			System.out.println(-1 * (n - m));
		}else {
		System.out.println(n - m);
		}
		sc.close();
	}

}