import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A + B + C == 180) {
			if(A == 60 && B == 60 && C == 60) {
				System.out.println("Equilateral");
			}else if(A == B) {
				System.out.println("Isosceles");
			}else if(C == B) {
				System.out.println("Isosceles");
			}else if(A == C) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Error");
		}
	}

}