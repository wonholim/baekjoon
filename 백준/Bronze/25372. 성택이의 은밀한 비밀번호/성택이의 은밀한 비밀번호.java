import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for(int i = 0; i < b; i++) {
			String[] a = sc.next().split("");
			if(a.length >= 6 && a.length <= 9) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
