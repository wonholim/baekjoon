import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		while(a --> 0) {
			String[] b = sc.nextLine().split(" ");
			String result = "";
			for(int i = 0; i < b.length; i++) {
				if(i == 0) {
					String c = b[i].substring(0, 1).toUpperCase();
					String d = b[i].substring(1);
					result = result + c + d + " ";
				}else {
					if(i != b.length -1) {
						result = result + b[i] + " ";
					}else {
						result = result + b[i];
					}
				}
			}
			System.out.println(result);
		}
	}

}
