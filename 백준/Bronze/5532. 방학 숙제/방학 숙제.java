import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if(b % d == 0) {
			b = b / d;
		}else {
			b = b / d + 1;
		}
		if(c % e == 0) {
			c = c / e;
		}else {
			c = c / e + 1;
		}
		
		int max = Math.max(b, c);
		System.out.println(a - max);
	}

}
