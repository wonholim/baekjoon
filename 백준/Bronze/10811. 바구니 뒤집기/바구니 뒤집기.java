
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[n + 1];
		for(int i = 1; i < n + 1; i++) {
			c[i] = i;
		}
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			while(a < b) {
				int tmp = c[a];
				c[a] = c[b];
				c[b] = tmp;
				b--;
				a++;
			}
		}
		for(int i = 1; i < n + 1; i++) {
			sb.append(c[i] + " ");
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
