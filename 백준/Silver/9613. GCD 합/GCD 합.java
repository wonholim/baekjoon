import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			long sum = 0;
			Set<Integer> s = new HashSet<>();
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			Integer[] d = new Integer[b];
			for(int i = 0; i < b; i++) {
				d[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(d, Collections.reverseOrder());
			for(int i = 0; i < b; i++) {
				for(int j = i + 1; j < b; j++) {
					sum = sum + gcd(d[i], d[j]);
				}
			}
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static Long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}

}