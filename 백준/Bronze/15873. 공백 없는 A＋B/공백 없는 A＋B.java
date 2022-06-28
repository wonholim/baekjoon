import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = new String[a.length()];
		b = a.split("");
		if(a.length() == 2) {
			System.out.println(Integer.parseInt(b[0]) + Integer.parseInt(b[1]));
		}else if(a.length() == 4) {
			System.out.println(20);
		}else {
			if(b[0].equals("1") && b[1].equals("0")) {
				System.out.println(10 + Integer.parseInt(b[2]));
			}else {
				System.out.println(10 + Integer.parseInt(b[0]));
			}
		}
	}

}