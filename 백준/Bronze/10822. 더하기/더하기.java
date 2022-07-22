import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String[] a = sc.next().split(",");
		int b = 0;
		for(String c : a) {
			b = b + Integer.parseInt(c);
		}
		System.out.println(b);
	}

}
