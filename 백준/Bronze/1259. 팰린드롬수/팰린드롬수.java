import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		while(true) {
			String a = sc.next();
			if(a.equals("0")) {
				break;
			}
			String[] b = a.split("");
			if(a.length() == 1) {
				System.out.println("yes");
			}else if(a.length() == 2) {
				if(b[0].equals(b[1])) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(a.length() == 3) {
				if(b[0].equals(b[2])) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(a.length() == 4) {
				if(b[0].equals(b[3]) && b[1].equals(b[2])) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(a.length() == 5) {
				if(b[0].equals(b[4]) && b[1].equals(b[3])) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			
		}
		
	}

}