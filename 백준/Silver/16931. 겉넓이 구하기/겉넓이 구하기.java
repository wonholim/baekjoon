

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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[][] c = new int[a][b];
		// 윗면, 아랫면
		int sum = (a * b) * 2;
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < b; j++) {
				c[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 앞면
		
		for(int i = 0; i < a; i++) {
			sum += c[i][0];
			for(int j = 1; j < b; j++) {
				if(c[i][j - 1] - c[i][j] < 0) {
					sum += c[i][j] - c[i][j - 1]; 
				}
			}
		}
		// 뒷면
		for(int i = 0; i < a; i++) {
			sum += c[i][b - 1];
			for(int j = b - 2; 0 <= j; j--) {
				if(c[i][j + 1] - c[i][j] < 0) {
					sum += c[i][j] - c[i][j + 1]; 
				}
			}
		}
		// 왼쪽옆면
		for(int j = 0; j < b; j++) {
			sum += c[0][j];
			for(int i = 1; i < a; i++) {
				if(c[i - 1][j] - c[i][j] < 0) {
					sum += c[i][j] - c[i - 1][j];				}
			}
		}
		// 오른쪽 옆면
		for(int j = 0; j < b; j++) {
			sum += c[a - 1][j];
			for(int i = a - 2; 0 <= i; i--) {
				if(c[i + 1][j] - c[i][j] < 0) {
					sum += c[i][j] - c[i + 1][j];				}
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
