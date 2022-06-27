import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 2 && B == 18) {
			System.out.println("Special");
		}else if((2 == A && B < 18) || (1 == A && B <= 31)) {
			System.out.println("Before");
		}else if((2 == A && B > 18) || (3 <= A && B > 0)){
			System.out.println("After");
		}
	}

}