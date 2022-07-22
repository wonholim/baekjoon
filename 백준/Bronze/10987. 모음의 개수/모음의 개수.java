import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String[] b = sc.next().split("");
		int count = 0;
		for(String c : b) {
			if(c.equals("i") || c.equals("a") || c.equals("e") || c.equals("o") || c.equals("u")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
