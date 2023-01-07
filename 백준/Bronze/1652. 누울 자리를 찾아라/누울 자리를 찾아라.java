

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
		char[][] c = new char[a][a];
		for(int i = 0; i < a; i++) c[i] = br.readLine().toCharArray();
		int cnt = 0;
		for(int i = 0; i < a; i++) {
			int tmp = 0;
			for(int j = 0; j < a; j++) {
				if(c[i][j] == '.') tmp++;
				else if(c[i][j] == 'X') {
					if(tmp >= 2) cnt++;
					tmp = 0;
				}
			}
			if(tmp >= 2) cnt++;
		}
		sb.append(cnt + " ");
		cnt = 0;
		for(int i = 0; i < a; i++) {
			int tmp = 0;
			for(int j = 0; j < a; j++) {
				if(c[j][i] == '.') tmp++;
				else if(c[j][i] == 'X') {
					if(tmp >= 2) cnt++;
					tmp = 0;
				}
			}
			if(tmp >= 2) cnt++;
		}
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
