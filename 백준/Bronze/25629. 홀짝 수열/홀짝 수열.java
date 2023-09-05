import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = 0;
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) % 2 == 0) m++;
		}
		System.out.println(n / 2 == m ? 1 : 0);
	}
}