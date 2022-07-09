import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		String[] c = b.split("");
		for(int i = b.length() - 1; 0 <= i; i--) {
			System.out.println(a * Integer.parseInt(c[i]));
		}
		System.out.println(a * Integer.parseInt(b));
		
	}

}