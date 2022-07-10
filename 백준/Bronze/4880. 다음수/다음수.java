import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a == 0 && b == 0 && c ==0) {
				break;
			}
			if(b - a == c - b) {
				System.out.println("AP " + (c + (c - b)));
			}else {
				System.out.println("GP " + (c * (c / b)));
			}
		}
	}

}