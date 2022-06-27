import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String f = sc.nextLine();
		String[] g = new String[5];
		g = f.split("");
		int a = Integer.parseInt(g[0]);
		int b = Integer.parseInt(g[1]);
		int c = Integer.parseInt(g[2]);
		int d = Integer.parseInt(g[3]);
		int e = Integer.parseInt(g[4]);
		System.out.print((a * a * a* a* a) + (b * b * b* b* b) + (c * c* c* c* c) + (d* d* d* d* d) + (e * e * e* e* e) );
	}

}
