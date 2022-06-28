import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int second = 0;
		if(a < 0) {
			second = (-1) * a * c + d + b * e;
		}else if(a > 0){
			second =  (b - a) * e;
		}else {
			second = d + b * e;
		}
		System.out.println(second);
	}
}