
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		long[] c = new long[t];
		Queue<Long> q = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		long max = 0;
		for(int i = 0; i < t; i++) {
			c[i] = Long.parseLong(st.nextToken());
			max += c[i];
		}
		long sum = 0;
		Arrays.sort(c);
		for(int i = 0; i < t; i++) {
			sum += c[i] * (max - c[i]);
			max -= c[i];
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}