
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static char[][] c;
	static int n;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[] dx = {1, 0};
	static int[] dy = {0, 1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		c = new char[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				c[i][j] = st.nextToken().charAt(0);
			}
		}
		dfs(0, 0, c[0][0] + "");
		sb.append(max + " " + min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j, String s) {
		// TODO Auto-generated method stub
		if(i == n - 1 && j == n - 1) {
			int sum = s.charAt(0) - '0';
			for(int a = 2; a < s.length(); a += 2) {
				if(s.charAt(a - 1) == '+') {
					sum += (s.charAt(a) - '0');
				}else if(s.charAt(a - 1) == '*'){
					sum *= (s.charAt(a) - '0');
				}else {
					sum -= (s.charAt(a) - '0');
				}
			}
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		for(int k = 0; k < 2; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < n && w < n) {
				dfs(q, w, s + c[q][w]);
			}
		}
	}

}
