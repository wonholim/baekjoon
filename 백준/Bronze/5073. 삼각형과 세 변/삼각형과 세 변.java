import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			int[] a = new int[3];
			for(int i = 0; i < 3; i++) {
				a[i] = sc.nextInt();
			}
			if(a[0] == 0 && a[1] == 0 && a[2] == 0) {
				break;
			}
			Arrays.sort(a);
			if(a[2] < a[1] + a[0]) {
				if(a[2] == a[1] && a[1] == a[0]) {
					System.out.println("Equilateral");
				}else if(a[2] != a[1] && a[1] != a[0] && a[2] != a[0]) {
					System.out.println("Scalene");
				}else {
					System.out.println("Isosceles");
				}
			}else {
				System.out.println("Invalid");
			}
		}
	}

}