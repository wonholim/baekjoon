import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		for(int k = 1; k < 10; k++) {
			System.out.println(i + " * " + k +" = " + i * k);
		}
	}

}