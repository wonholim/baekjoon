import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(sc.nextInt());
		vc.add(sc.nextInt());
		vc.add(sc.nextInt());
		Collections.sort(vc);
		System.out.println(vc.get(1));
	}

}