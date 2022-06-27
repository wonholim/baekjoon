import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(sc.hasNext()) {
			String c = sc.next();
			String[] str = new String[b];
			str = c.split("");
			for(int j = b; 0 < j; j--) {
				System.out.print(str[j - 1]);
			}
			System.out.println();
		}
	}

}