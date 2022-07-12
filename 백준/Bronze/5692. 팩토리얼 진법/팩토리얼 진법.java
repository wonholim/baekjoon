import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int sum = 0;
			String a = sc.next();
			String[] b = a.split("");
			if(a.equals("0")) {
				break;
			}
			for(int i = 0; i < a.length(); i++) {
				sum = sum + fact(b[i], a.length() - i);
			}
			System.out.println(sum);
		}
	}

	private static int fact(String a, int i) {
		// TODO Auto-generated method stub
		int sum = 1;
		for(int k = i; 0 < k; k--) {
			sum = sum * k;
		}
		sum = Integer.parseInt(a) * sum;
		return sum;
	}

}