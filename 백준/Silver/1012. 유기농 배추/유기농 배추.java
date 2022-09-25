import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int count;
	static boolean[][] check;
	static int[][] e;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			e = new int[b][c];
			check = new boolean[b][c];
			int d = Integer.parseInt(st.nextToken());
			while(d --> 0) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int g = Integer.parseInt(st.nextToken());
				e[f][g] = 1;
			}
			for(int i = 0; i < b; i++) {
				for(int j = 0; j < c; j++) {
					if(e[i][j] == 0 || check[i][j]) continue;
					search(i, j);
					count++;
				}
			}
			sb.append(count + "\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void search(int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || j < 0 || i >= e.length || j >= e[0].length ) return;
		if(e[i][j] == 0 || check[i][j]) return;
		if(!check[i][j] && e[i][j] == 1) check[i][j] = true;
		search(i + 1, j);
		search(i, j + 1);
		search(i - 1, j);
		search(i, j - 1);
	}

}
