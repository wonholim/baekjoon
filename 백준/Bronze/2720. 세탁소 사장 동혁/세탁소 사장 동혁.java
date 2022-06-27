import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int q, d, n ,p;
		for(int i = 0; i < tc; i++) {
			int money = sc.nextInt();
			q = money / 25;
			money = money - (25 * q);
			d = money / 10;
			money = money - (10 * d);
			n = money / 5;
			money = money - (5 * n);
			p = money / 1;
			money = money - (1 * p);
			System.out.println(q +" "+ d +" "+ n +" "+ p);
		}
	}

}