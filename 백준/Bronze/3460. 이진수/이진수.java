import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			String s = Integer.toBinaryString(b);
			StringBuffer sb = new StringBuffer(s);
	        String tr = sb.reverse().toString();
			String[] st = tr.split("");
			for(int k = 0; k < s.length(); k++) {
				if(st[k].equals("1")) {
					System.out.print(k + " ");
				}
			}
		}
	}

}
