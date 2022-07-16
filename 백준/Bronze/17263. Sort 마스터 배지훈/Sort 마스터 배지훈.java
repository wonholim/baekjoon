import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(a - 1));
	}

}
