import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(Long.toBinaryString(Long.parseLong(a, 2) * Long.parseLong(b, 2)));
	}

}
