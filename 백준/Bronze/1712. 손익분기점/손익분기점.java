import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		if(c - b > 0) {
			System.out.println(( a / (c - b)) +1);
		}else {
			System.out.println(-1);

		}
	}

}