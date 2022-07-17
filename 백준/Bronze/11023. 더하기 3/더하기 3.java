import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while(sc.hasNext()) {
			list.add(sc.nextInt());
		}
		int sum = 0;
		for(int j : list) {
			sum = sum + j;
		}
		System.out.println(sum);
	}

}
