import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		int sum = 0;
		for(int i = 0; i < 7; i++) {
			int a = sc.nextInt();
			if(a % 2 != 0) {
				vc.add(a);
			}
		}
		Collections.sort(vc);
		for(int i = 0; i < vc.size(); i++) {
			sum = sum + vc.get(i);
		}
		if(vc.size() > 0) {
		System.out.println(sum);
		System.out.println(vc.get(0));
		}else {
			System.out.println(-1);
		}
	}

}