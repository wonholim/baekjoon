import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		StringBuffer s = new StringBuffer(a);
		a = s.reverse().toString();
		StringBuffer s1 = new StringBuffer(b);
		b = s1.reverse().toString();
		System.out.println(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
	}

}