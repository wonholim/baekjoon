import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String a;
		String[] str;
		a = sc.nextLine();
		for(int i = 0; i < t; i++) {
		a = sc.nextLine();
		str = new String[a.length()];
		str = a.split("");
		System.out.println(str[0] +""+ str[str.length -1]);
		}
	}

}