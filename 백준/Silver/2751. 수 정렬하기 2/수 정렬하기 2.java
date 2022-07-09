import java.io.IOException;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		Vector<Integer> vc = new Vector<Integer>();
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			vc.add(sc.nextInt());
		}
		Collections.sort(vc);
		for(int i = 0; i < vc.size(); i++) {
			s.append(vc.get(i) + "\n");
		}
		System.out.println(s.toString());
	}

}
