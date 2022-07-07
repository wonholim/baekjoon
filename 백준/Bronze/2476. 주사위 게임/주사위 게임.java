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
			int[] st = new int[3];
			st[0] = sc.nextInt();
			st[1] = sc.nextInt();
			st[2] = sc.nextInt();
			int max = 0;
			if(st[0] == st[1] && st[1] == st[2]) {
				vc.add(10000 + (st[0] * 1000));
				
			}else if(st[0] == st[1]){
				vc.add(1000 + (st[0] * 100));
				
			}else if(st[1] == st[2]){
				vc.add(1000 + (st[1] * 100));
				
			}else if(st[0] == st[2]){
				vc.add(1000 + (st[2] * 100));
				
			}else {
				max = Math.max(st[0], st[1]);
				max = Math.max(max, st[2]);
				vc.add(max * 100);
			}
		}
		Collections.sort(vc);
		System.out.println(vc.get(vc.size() - 1 ));
	}

}