import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A + B + C >= 100) {
			System.out.println("OK");
		}else {
			int min = Math.min(A, B);
			min = Math.min(min, C);
			if(min == A) {
				System.out.println("Soongsil");
			}else if(min == B) {
				System.out.println("Korea");
			}else {
				System.out.println("Hanyang");
			}
		}
	}

}