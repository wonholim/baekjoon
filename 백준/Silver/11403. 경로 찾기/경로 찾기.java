import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int[][] b = new int[a][a];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < a; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				for(int k = 0; k < a; k++) {
					if(b[j][i] == 1 && b[i][k] == 1) {
						b[j][k] = 1;
					}
				}
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				sb.append(b[i][j] + " ");
			}
			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
