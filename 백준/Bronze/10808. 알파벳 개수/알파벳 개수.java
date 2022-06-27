import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] c = new char[a.length()];
		c = a.toCharArray();
		int[] b = new int[26];
		for(int i = 0; i < a.length(); i++) {
			b[c[i] - 97]++;
		}
		for(int d : b) {
			System.out.print(d + " ");
		}
	}

}
