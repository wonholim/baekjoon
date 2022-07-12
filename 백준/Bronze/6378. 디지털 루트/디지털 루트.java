import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int r = 0;
			String a = sc.next();
			String[] b = a.split("");
			if(a.equals("0")) {
				break;
			}
			for(int i = 0; i < b.length; i++) {
				r = r + Integer.parseInt(b[i]);
			}
			while(true) {
				if(r >= 10) {
					String[] d = Integer.toString(r).split("");
					r = 0;
					for(int k = 0; k < d.length; k++) {
						r = r + Integer.parseInt(d[k]);
					}
				}else {
					break;
				}
			}
			System.out.println(r);
		}
	}

}
