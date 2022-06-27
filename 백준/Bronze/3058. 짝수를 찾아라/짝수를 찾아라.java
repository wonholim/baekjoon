import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc;
		int tc = sc.nextInt();
		for(int i = 0; i < tc; i++) {
			int u = 0;
			int s = 0;
			int min = 101;
			vc = new Vector<Integer>();
			for(int j = 0; j < 7; j++) {
				int num = sc.nextInt();
				if(num % 2 == 0) {
					vc.add(num);
				}				
			}
			for(int k = 0; k < vc.size(); k++) {
				u = vc.get(k);
				s = s + u;
				if(vc.get(k) < min) {
					min = vc.get(k);
				}
			}
			System.out.println(s +" "+ min);
		}
	}

}