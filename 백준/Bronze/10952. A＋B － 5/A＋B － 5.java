import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A == 0 && B == 0) {
			break;
		}
		System.out.println(A+B);

		}
	}

}
