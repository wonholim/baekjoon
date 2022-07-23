import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		while(a --> 0) {
			String c = "god";
			String[] b = sc.nextLine().split(" ");
			for(int i = 1; i < b.length; i++) {
				c = c + b[i];
			}
			System.out.println(c);
		}
	}

}
