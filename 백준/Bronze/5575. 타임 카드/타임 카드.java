import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		if(c > c1) {
			c = c1 + 60 - c;
			b1--;
			if(b > b1) {
				b = b1 + 60 - b;
				a1--;
				System.out.println(a1 - a + " " + b + " " + c);
			}else {
				b = b1 - b;
				System.out.println(a1 - a + " " + b + " " + c);
			}
		}else {
			c = c1 - c;
			if(b > b1) {
				b = b1 + 60 - b;
				a1--;
				System.out.println(a1 - a + " " + b + " " + c);
			}else {
				b = b1 - b;
				System.out.println(a1 - a + " " + b + " " + c);
			}
		}
		}
	}

}