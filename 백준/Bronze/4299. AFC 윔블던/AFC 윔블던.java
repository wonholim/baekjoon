import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = 0, y = 0;
		x = (A + B) / 2;
		y = ((A + B) / 2) - B;
		if((A < B) || (A + B) % 2 != 0) {
			System.out.println(-1);
		}else {
			System.out.println(x + " " + y);
		}
		
	}

}