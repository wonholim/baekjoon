import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		for(int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			vc.add(a);
		}
		Collections.sort(vc);
		System.out.println(Math.abs((vc.get(3) + vc.get(0)) - (vc.get(2) + vc.get(1))));
	}

}