import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(b.indexOf(c) + " ");
		}				
	}
}