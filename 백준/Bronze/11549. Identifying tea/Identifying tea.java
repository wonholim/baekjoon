import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		for(int i = 0; i < 5; i++) {
			int b = sc.nextInt();
			if(b == a) {
				count++;
			}
		}
		
		System.out.print(count);
	}

}