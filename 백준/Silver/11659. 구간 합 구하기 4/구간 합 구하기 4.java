import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] c = new int[a + 1];
		int[] s = new int[a + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			s[i] = s[i - 1] + c[i];
		}
		while(b --> 0) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			sum = s[e] - s[d - 1];
			sb.append(sum).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}