import java.util.Scanner;

public class Main {
	static int[] m = new int[100000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fibo(a));
	}

	private static int fibo(int a) {
		// TODO Auto-generated method stub
		if(a <= 1) return a;
		if(m[a] != 0) return m[a];
		return m[a] = fibo(a - 1) + fibo(a - 2);
	}

}
