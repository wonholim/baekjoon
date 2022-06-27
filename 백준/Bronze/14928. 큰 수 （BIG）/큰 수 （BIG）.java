import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = new String[a.length()];
		b = a.split("");
		long c = 0;
		for(int i = 0; i < a.length(); i ++) {
			c = (c * 10 + (Integer.parseInt(b[i]))) % 20000303;
		}
		System.out.println(c);
	}

}
