import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int j = a - 1; i < j; j--){
				System.out.print(" ");
			}
			for(int k = 0; k < 1; k++) {
				System.out.print("*");
			}
			for(int j = 0; j < 2 * i - 1; j++){
				System.out.print(" ");
			}
			if(i != 0) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
