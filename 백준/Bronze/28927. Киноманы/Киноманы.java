import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()) * 3
				+ Integer.parseInt(st.nextToken()) * 20
				+ Integer.parseInt(st.nextToken()) * 120;
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()) * 3
				+ Integer.parseInt(st.nextToken()) * 20
				+ Integer.parseInt(st.nextToken()) * 120;
		StringBuilder sb = new StringBuilder();
		if (a == b) sb.append("Draw");
		else if (a > b) sb.append("Max");
		else sb.append("Mel");
		System.out.println(sb.toString());
	}
}