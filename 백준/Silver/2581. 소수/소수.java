import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vc = new Vector<Integer>();
		int b = sc.nextInt();
		int a = sc.nextInt();
		int count = 0;
		int sum = 0;
		int[] a1 = new int[a];
		int i, j;
		for(i = 2; i <= a; i++) {
			count = 0;
			for(j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				a1[i - 2] = j-1;
			}else {
				a1[i - 2] = 0;
			}
		}
		for(int k = 0; k < a1.length; k++) {
			if(a1[k] != 0 && a1[k] >= b) {
				vc.add(a1[k]);
				sum = sum + a1[k];
			}
		}
		if(vc.size() != 0) {
			System.out.println(sum);
			System.out.println(vc.get(0));
		}else {
			System.out.println(-1);
		}
	}

}