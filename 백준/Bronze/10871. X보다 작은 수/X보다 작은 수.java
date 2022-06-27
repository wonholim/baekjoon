import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] c = new int[a];
		for(int i = 0; i < a; i++) {
			c[i] = sc.nextInt();
		}
		for(int j = 0; j < c.length; j++) {
			if(c[j] < b) {
				System.out.print(c[j] + " ");
			}
		}
		
	}

}