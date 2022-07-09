import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] b = new int[5];
		for(int i = 0; i < 5; i++) {
			String a = sc.next();
			String[] c = a.split("");
			for(int k = 0; k < a.length(); k++) {
				if(c[k].equals("F") && k < a.length() - 2) {
					if(c[k + 1].equals("B")) {
						if(c[k + 2].equals("I")) {
							b[i]++;
							break;
						}
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(b[i] == 1) {
				System.out.print((i + 1) + " ");
			}else {
				count++;
			}
		}
		if(count == 5) {
			System.out.println("HE GOT AWAY!");
		}
	}

}