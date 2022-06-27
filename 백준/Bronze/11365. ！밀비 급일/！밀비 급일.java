import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String b = sc.nextLine();
			if(b.equals("END")) {
				break;
			}
			String[] str = new String[b.length()];
			str = b.split("");
			for(int i = b.length(); 0 < i; i--) {
				System.out.print(str[i - 1]);
			}
			System.out.println();
		}
	}

}
