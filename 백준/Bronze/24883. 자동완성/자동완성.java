import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.equals("N") ||a.equals("n")) {
			System.out.println("Naver D2");
		}else {
			System.out.println("Naver Whale");
		}
	}

}