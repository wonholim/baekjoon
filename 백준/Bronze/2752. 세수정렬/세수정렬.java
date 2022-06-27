import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			vc.add(a);
		}
		Collections.sort(vc);
		for(int j = 0; j < vc.size(); j++) {
			System.out.print(vc.get(j) + " ");
		}
	}

}