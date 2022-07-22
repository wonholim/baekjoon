import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		while(a --> 0) {
			int sum = 0;
			String[] b = sc.next().split(",");
			for(String c : b) {
				sum = sum + Integer.parseInt(c);
			}
			System.out.println(sum);
		}
	}

}