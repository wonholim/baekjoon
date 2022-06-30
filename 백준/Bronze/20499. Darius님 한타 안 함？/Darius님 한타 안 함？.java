import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] str = new String[3];
		str = a.split("/");
		if((Integer.parseInt(str[0]) + Integer.parseInt(str[2])) < Integer.parseInt(str[1]) || Integer.parseInt(str[1]) == 0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
	}

}