import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split("");
		System.out.println(b[2]+""+b[1]+""+b[0]);
	}

}