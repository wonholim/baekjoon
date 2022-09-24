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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int[][] b = new int[a][a];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				b[i][j] = 99999999;
				if(i == j) {
					b[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < g; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			b[c - 1][d - 1] = 1;
			b[d - 1][c - 1] = 1;
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				for(int k = 0; k < a; k++) {
					if(b[j][i] + b[i][k] < b[j][k]) {
						b[j][k] = b[j][i] + b[i][k];
					}
				}
			}
		}
		int max = Integer.MAX_VALUE;
		int sum = 0;
		int index = 0;
		for(int i = 0; i < a; i++) {
			sum = 0;
			for(int j = 0; j < a; j++) {
				sum += b[i][j];
			}
			if(sum < max) {
				max = sum;
				index = i;
			}
		}
		sb.append(index + 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
