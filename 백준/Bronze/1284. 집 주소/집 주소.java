import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String a = sc.next();
			if(a.equals("0")){
				break;
			}
			String[] s = new String[a.length()];
			s = a.split("");
			int n = 0;
			for(int i = 0; i < a.length(); i++) {
				if(s[i].equals("1")) {
					n = n + 3;
				}else if(s[i].equals("0")) {
					n = n + 5;
				}else {
					n = n + 4;
				}
			}
			System.out.println(n + 1);
		}
	}

}
