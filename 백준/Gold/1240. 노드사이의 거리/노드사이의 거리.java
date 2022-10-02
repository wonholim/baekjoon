import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] c;
	static int max = 1000000002;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		c = new int[a + 1][a + 1];
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a; j++) {
				if(i == j) c[i][j] = 0;
				else c[i][j] = max;
			}
		}
		for(int i = 1; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			c[node1][node2] = c[node2][node1] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a; j++) {
				for(int k = 1; k <= a; k++) {
					c[j][k] = Math.min(c[j][k], c[j][i] + c[i][k]); 
				}
			}
		}
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			sb.append(c[node1][node2] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}