import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			String b = sc.next();
			String[] st = new String[b.length()];
			st = b.split("X");
			System.out.println(sum(st));
		}
	}

	private static int sum(String[] st) {
		int sum = 0;
		for(int i = 0; i < st.length; i++) {
			sum = sum + hap(st[i]);
		}
		return sum;
	}

	private static int hap(String st) {
		// TODO Auto-generated method stub
		int k = 0;
		for(int i = 1; i <= st.length(); i++) {
			k = k + i;
		}
		return k;
	}

}