import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] b = new int[26];
		String a = sc.next();
		a = a.toUpperCase();
		char[] c = new char[a.length()];
		c = a.toCharArray();
		for(int i = 0; i < a.length(); i++) {
			b[c[i] - 65]++;
		}
		int max = -999;
		char ch = ' ';
		for(int i = 0; i < 26; i++) {
			if(b[i] > max) {
				max = b[i];
				ch = (char) (i + 65);
			}else if(b[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}