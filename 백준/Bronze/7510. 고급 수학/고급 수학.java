import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			System.out.println("Scenario #" + (i + 1) + ":");
			int[] b = new int[3];
			for(int k = 0; k < 3; k++) {
				b[k] = sc.nextInt();
			}
			Arrays.sort(b);
			if((b[0] * b[0]) + (b[1] * b[1]) == b[2] * b[2]) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			System.out.println();
		}
	}

}