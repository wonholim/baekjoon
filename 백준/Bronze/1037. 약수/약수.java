import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Vector<Integer> vc = new Vector<Integer>();
		for(int i = 0; i < a; i++) {
			vc.add(sc.nextInt());
		}
		Collections.sort(vc);
		if(vc.size() == 1) {
			System.out.println(vc.get(0) * vc.get(0));
		}else {
		System.out.println(vc.get(0) * vc.get(a - 1));
		}
	}

}