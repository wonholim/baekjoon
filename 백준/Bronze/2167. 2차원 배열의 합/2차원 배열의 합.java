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
		int b = Integer.parseInt(st.nextToken());
		int[][] c = new int[a][b];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int d = Integer.parseInt(br.readLine());
		while(d --> 0) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int e = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			for(int i = e - 1; i <= g - 1; i++) {
				for(int j = f - 1; j <= h - 1; j++) {
					sum += c[i][j];
				}
			}
			sb.append(sum).append("\n");
			
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}