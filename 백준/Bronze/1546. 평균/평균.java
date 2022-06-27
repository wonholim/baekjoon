import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vc = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int sco = sc.nextInt();
		int sca;
		int max = 0;
		int sum = 0;
		double abc;
		for(int i = 0; i < sco; i++) {
			sca = sc.nextInt();
			vc.add(sca);
		}
		for(int i = 0; i < sco; i++) {
			if(vc.get(i) > max) {
				max = vc.get(i);
			}
		}
		for(int i = 0; i < sco; i++) {
			sum = sum + vc.get(i);
		}
		abc = (double)sum / max * 100;
		System.out.println((double)(abc / sco));
		sc.close();
	}

}