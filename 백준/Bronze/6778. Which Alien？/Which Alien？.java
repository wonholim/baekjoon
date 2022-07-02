import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a >=3 && b <= 4) {
			System.out.println("TroyMartian");
		}
		if(a <= 6 && b >= 2) {
			System.out.println("VladSaturnian");
		}
		if(a <= 2 && b <= 3) {
			System.out.println("GraemeMercurian");
		}
		
		sc.close();
	}

}
