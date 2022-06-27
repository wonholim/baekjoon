import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(pibo(a));
		sc.close();
	}

	private static int pibo(int p) {
		// TODO Auto-generated method stub
		if(p <= 1) {
			return p;
		}else {
		return pibo(p-2) + pibo(p-1); 
		}
	}

}