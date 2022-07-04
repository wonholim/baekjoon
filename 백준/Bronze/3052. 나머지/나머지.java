import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if(!vc.contains(a % 42)) {
				vc.add(a % 42);
			}
		}
		System.out.println(vc.size());
	}

}
