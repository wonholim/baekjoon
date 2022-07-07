import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			int count = 0;
			for(int j = 0; j < 4; j++) {
				int a = sc.nextInt();
				if(a == 1) {
					count++;
				}
			}
			if(count == 4) {
				System.out.println("E");
			}else if(count == 3) {
				System.out.println("A");
			}else if(count == 2) {
				System.out.println("B");
			}else if(count == 1){
				System.out.println("C");
			}else {
				System.out.println("D");
			}
		}
	}

}