import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		if(a.length() < b.length()) {
			System.out.print("no");
		}else {
			System.out.print("go");
		}

		sc.close();
	}

}