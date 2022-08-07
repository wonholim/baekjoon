import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m >= 45) {
			m -= 45;
		}else {
			h--;
			m = m + 15;
			if(h == -1) {
				h = 23;
			}
		}
		System.out.println(h + " " + m);
		sc.close();
	}

}