import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			String b = sc.next();
			System.out.println("String #" + (i + 1));
			for(int k = 0; k < b.length(); k++) {
				if(b.charAt(k) + 1 != 91) {
					System.out.print((char) (b.charAt(k) + 1));
				}else {		
					System.out.print((char) (b.charAt(k) - 25));
				}
			}
			System.out.println();
			System.out.println();
		}
	}

}