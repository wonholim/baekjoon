import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] q = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String s = Integer.toString(a * b * c);
		String[] st = new String[s.length()];
		st = s.split("");
		for(int i = 0; i < s.length(); i++) {
			q[Integer.parseInt(st[i])]++;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(q[i]);
		}
	}

}