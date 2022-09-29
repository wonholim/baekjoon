import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static boolean[][] c;
	static int[][] RG;
	static int[][] blue;
	static int count = 0;
	static int M = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		c = new boolean[a][a];
		RG = new int[a][a];
		blue = new int[a][a];
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < a; j++) {
				if(g.charAt(j) == 'R') {
					RG[i][j] = 1;
					blue[i][j] = 1;
				}else if(g.charAt(j) == 'G') {
					RG[i][j] = 2;
					blue[i][j] = 1;
				}
			}
		}
		for(int k = 0; k < 3; k++) {
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					if(RG[i][j] == k && !c[i][j]) {
						M = k;
						dfs(i, j);
						count++;
					}
				}
			}
		}
		sb.append(count + " ");
		c = new boolean[a][a];
		count = 0;
		for(int k = 0; k < 2; k++) {
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					if(blue[i][j] == k && !c[i][j]) {
						M = k;
						dfs1(i, j);
						count++;
					}
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < RG.length && w < RG.length){
				if(RG[q][w] == M && !c[q][w]) {
					c[q][w] = true;
					dfs(q, w);
				}
			}
		}
	}
	private static void dfs1(int i, int j) {
		// TODO Auto-generated method stub
		for(int k = 0; k < 4; k++) {
			int q = i + dx[k];
			int w = j + dy[k];
			if(q >= 0 && w >= 0 && q < RG.length && w < RG.length){
				if(blue[q][w] == M && !c[q][w]) {
					c[q][w] = true;
					dfs1(q, w);
				}
			}
		}
	}
}
