import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 2;
		int c = 7;
		int i = 1;
		while(true) {
			if(a == 1) {
				System.out.println(i);
				break;
			}

			if(b <= a && a <= c) {
				System.out.println(i + 1);
				break;
			}else {
				b = b + (6 * i);
				c = c + 6 + (6 * i);
				i++;
			}
		}
	}

}