import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			String b = sc.next();
			String[] c = b.split("");
			if(Integer.parseInt(c[b.length()- 1]) % 2 == 0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}