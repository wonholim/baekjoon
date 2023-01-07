

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
		char[][] c = new char[a][b];
		for(int i = 0; i < a; i++) c[i] = br.readLine().toCharArray();
		int cnt = 0;
		int tmp = 0;
		for(int i = 0; i < a; i++) {
			boolean check = false;
			for(int j = 0; j < b; j++) {
				if(c[i][j] == 'X') {
					check = true;
					break;
				}
			}
			if(!check) cnt++;
		}
		for(int i = 0; i < b; i++) {
			boolean check = false;
			for(int j = 0; j < a; j++) {
				if(c[j][i] == 'X') {
					check = true;
					break;
				}
			}
			if(!check) tmp++;
		}
		sb.append(Math.max(tmp, cnt));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
