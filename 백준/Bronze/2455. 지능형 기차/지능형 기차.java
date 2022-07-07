import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		int max = 0;
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			max = b - a + max;
			vc.add(max);
		}
		Collections.sort(vc);
		System.out.println(vc.get(vc.size() - 1 ));
	}

}