import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b == 1 || b == 2) {
			System.out.println("NEWBIE!");
		}else if((b <= a)) {
			System.out.println("OLDBIE!");
		}else {
			System.out.println("TLE!");
		}
		
	}

}