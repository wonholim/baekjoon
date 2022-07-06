import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int s1 = sc.nextInt();
		if(s1 + s >= 60) {
			m = m + ((s + s1) / 60);
			if(s + (s1 % 60) >= 60 ) {
				s = (s + (s1 % 60)) - 60;
			}else {
				s = s + (s1 % 60);
			}
			if(m >= 60) {
				t = t + (m / 60);
				m = m % 60;
				while(true) {
					if(t >= 24) {
						t = t - 24;
					}else {
						System.out.println(t +" "+ m +" "+ s);
						break;
					}
				}
			}else {
				System.out.println(t +" "+ m +" "+ s);
			}
		}else {
			s = s + s1;
			System.out.println(t +" "+ m +" "+ s);
		}
	}

}