import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		while(true) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(b == 0 && c == 0) break;
			e = new int[c][b];
			check = new boolean[c][b];
			for(int i = 0; i < c; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < b; j++) {
					e[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for(int i = 0; i < c; i++) {
				for(int j = 0; j < b; j++) {
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
		search(i - 1, j - 1);
		search(i + 1, j - 1);
		search(i - 1, j + 1);
		search(i + 1, j + 1);
		search(i + 1, j);
		search(i, j + 1);
		search(i - 1, j);
		search(i, j - 1);
	}
}