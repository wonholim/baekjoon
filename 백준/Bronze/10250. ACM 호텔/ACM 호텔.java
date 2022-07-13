import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			if(n % h != 0) {
				if((1 + (n / h)) >= 10) {
					System.out.println(n % h + "" + (1 + (n / h)));
				}else {
					System.out.println(n % h + "0" + (1 + (n / h)));
				}
			}else {
				if(((n / h)) >= 10) {
					System.out.println(h + "" + ((n / h)));
				}else {
					System.out.println(h + "0" + ((n / h)));
				}
			}
		}
	}

}
