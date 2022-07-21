import java.util.Scanner;

public class Main {
	static long[] st;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		st = new long[100000];
		System.out.println(fino(a));
	}

	private static long fino(int a) {
		// TODO Auto-generated method stub
		if(a == 0) return a;
		else if(a == 1) return a;
		else if(st[a] != 0) return st[a];
		return st[a] = fino(a - 1) + fino(a - 2);
	}

}
