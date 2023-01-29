

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 누적합과 매개변수 탐색을 이용한 최대 정사각형 찾기
	// 4095번을 DP로 이미 풀어보고, pentagon03님의 풀이를 보고 다시 풀어보았습니다.
	// 이걸어케 이케풀지.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int[][] c = new int[x + 1][y + 1];
		for(int i = 1; i <= x; i++) {
			String g = br.readLine();
			for(int j = 1; j <= y; j++) {
				c[i][j] = (g.charAt(j - 1) - '0');
				c[i][j] += c[i][j - 1] + c[i - 1][j] - c[i - 1][j - 1];
			}
		}
		int low = 0;
		int high = Math.min(x, y) + 1;
		while(low + 1 < high) {
			int mid = (low + high) / 2;
			int size = mid * mid;
			boolean check = false;
			outer : for(int i = mid; i <= x; i++) {
				for(int j = mid; j <= y; j++) {
					if(c[i][j] - c[i - mid][j] - c[i][j - mid] + c[i - mid][j - mid] == size) {
						check = true;
						break outer;
					}
				}
			}
			if(check) low = mid;
			else high = mid;
		}
		sb.append(low * low);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
