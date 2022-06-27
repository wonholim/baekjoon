import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) > 64 && a.charAt(i) < 91) {
				System.out.print((char)(a.charAt(i) + 32));
			}else {
			System.out.print((char)(a.charAt(i) - 32));
			}
		}

		sc.close();
	}

}