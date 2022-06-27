import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		String b = sc.next();
		String[] c = new String[b.length()];
		c = b.split("");
		for(int i = 0; i < b.length(); i++) {
			sum = sum + Integer.parseInt(c[i]);
		}
		System.out.println(sum);
	}

}