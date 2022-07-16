import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int b = sc.nextInt();
		for(int i = 0; i < b; i++) {
			int a = sc.nextInt();
			if(a != 0) {
				list.add(a);
			}else {
				list.remove(list.size() - 1);
			}
		}
		int sum = 0;
		for(int j : list) {
			sum = sum + j;
		}
		System.out.println(sum);
	}

}
