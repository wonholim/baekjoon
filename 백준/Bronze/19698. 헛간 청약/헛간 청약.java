import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int i = (b / d) * (c / d);

		if(a > i) {
			System.out.println(i);
		}else {
			System.out.println(a);
		}
	}

}
