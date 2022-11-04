

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int[][] cc;
	static int INF = 1000000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		cc = new int[52][52];
		for(int i = 0; i < 52; i++) {
			for(int j = 0; j < 52; j++) {
				if(i != j) cc[i][j] = INF;
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int d = 0;
			int e = 0;
			
			char b = st.nextToken().charAt(0);
			st.nextToken();
			char c = st.nextToken().charAt(0);
			if(b >= 'A' && b <= 'Z') d = b - 'A';
			else if(b >= 'a' && b <= 'z') d = b - 'G';
			
			if(c >= 'A' && c <= 'Z') e = c - 'A';
			else if(c >= 'a' && c <= 'z') e = c - 'G';
			
			cc[d][e] = 1;
		}
		for(int k = 0; k < 52; k++) {
			for(int i = 0; i < 52; i++) {
				for(int j = 0; j < 52; j++) {
					cc[i][j] = Math.min(cc[i][j], cc[i][k] + cc[k][j]);
				}
			}
		}
		ArrayList<int []> list = new ArrayList<>();
		for(int i = 0; i < 52; i++) {
			for(int j = 0; j < 52; j++) {
				if(cc[i][j] != INF && i != j) {
					list.add(new int[] {i, j});
				}
			}
		}
		sb.append(list.size() + "\n");
		for(int[] g : list) {
			if(g[0] >= 0 && g[0] <= 25) sb.append((char) (g[0] + 'A'));
			else if(g[0] >= 26 && g[0] < 52) sb.append((char) (g[0] + 'G'));
			sb.append(" => ");
			if(g[1] >= 0 && g[1] <= 25) sb.append((char) (g[1] + 'A'));
			else if(g[1] >= 26 && g[1] < 52) sb.append((char) (g[1] + 'G'));
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
