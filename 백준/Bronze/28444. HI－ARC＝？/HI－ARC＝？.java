import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[5];
		for (int i = 0; i < 5; i++) c[i] = Integer.parseInt(st.nextToken());
		System.out.println((c[0] * c[1]) - (c[2] * c[3] * c[4]));
	}
}