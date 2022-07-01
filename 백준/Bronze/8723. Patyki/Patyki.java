import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a == b && b == c) {
			System.out.println("2");
		}else if((a * a) + (b * b) == c * c || (c * c) + (b * b) == a * a || (a * a) + (c * c) == b * b){
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}