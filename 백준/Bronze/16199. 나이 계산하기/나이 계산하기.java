import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int A1 = sc.nextInt();
		int B1 = sc.nextInt();
		int C1 = sc.nextInt();
		if(A == A1) {
			System.out.println(A1 - A);
		}else{
			if(B > B1) {
				System.out.println((A1 - A) - 1);
			}else if(B == B1) {
				if(C1 >= C) {
					System.out.println((A1 - A));
				}else {
					System.out.println((A1 - A) - 1);
				}
			}else {
				System.out.println((A1 - A));
			}
		}
		System.out.println((A1 - A) + 1);
		System.out.println((A1 - A));
	}
}
