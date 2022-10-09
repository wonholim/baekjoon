import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder reverse;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		long[] b = new long[a];
		int i = 0;
		while(st.hasMoreTokens()) {
			reverse = new StringBuilder(st.nextToken());
			b[i] = Long.parseLong(reverse.reverse().toString());
			i++;
		}
		while(i != a) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				reverse = new StringBuilder(st.nextToken());
				b[i] = Long.parseLong(reverse.reverse().toString());
				i++;
			}
		}
		Arrays.sort(b);
		for(long g : b) {
			sb.append(g + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
