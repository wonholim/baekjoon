import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		int count;
		while(sc.hasNext()) {
			a = sc.nextLine();
			if(a.charAt(0) == '#') {
				break;
			}
			count = 0;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == 'a' || a.charAt(i) == 'A' ||a.charAt(i) == 'E' ||
						a.charAt(i) == 'I'|| a.charAt(i) == 'O' ||a.charAt(i) == 'U' 
						||a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}