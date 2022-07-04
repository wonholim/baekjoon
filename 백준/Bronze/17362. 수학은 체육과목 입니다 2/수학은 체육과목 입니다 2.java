import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = {2,1,2,3,4,5,4,3};
		int b = sc.nextInt();
		b = b % 8;

		System.out.println(a[b]);

	}

}