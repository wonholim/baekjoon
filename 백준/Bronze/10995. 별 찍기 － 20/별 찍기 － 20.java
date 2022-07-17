import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			if(i % 2 != 0) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * a - 1; j++) {
				if(j % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
