import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int lp;
		String init;
		for(int i = 0; i < tc; i++) {
				lp = sc.nextInt();
				init = sc.next();
				for(int k = 0; k < init.length(); k++) {
					for(int a = 0; a < lp; a++) {
						System.out.print(init.charAt(k));
					}
				}
				System.out.println();
		}
	}
}