
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		long[][] pfx = new long[n + 1][m + 1];
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < m + 1; j++) {
				pfx[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < m + 1; j++) {
				pfx[i][j] += pfx[i - 1][j] + pfx[i][j - 1] - pfx[i - 1][j - 1]; 
			}
		}
		
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			long sum = pfx[xx][yy] - pfx[x][yy] - pfx[xx][y] + pfx[x][y];
			int count = 0;
			for(int i = x; i < xx; i++) {
				for(int j = y; j < yy; j++) {
					count++;
				}
			}
			sb.append(sum / count).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
